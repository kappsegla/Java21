package se.iths.java21.lab2;

import se.iths.java21.lab2.entities.Brand;
import se.iths.java21.lab2.entities.Category;
import se.iths.java21.lab2.entities.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;
import java.util.regex.Pattern;

public class LabDemo {
    private static final Pattern pattern = Pattern.compile(",");
    private static final Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public static void main(String[] args) {
        LabDemo demo = new LabDemo();
        demo.run();
    }

    private void run() {
        load();
        String choice;
        do {
            printMenu();
            choice = getChoice();
        } while (executeChoice(choice));
        save();
    }

    private Path getPath() {
        String homePath = System.getProperty("user.home");
        return Path.of(homePath, "products.csv");
    }

    private void save() {
        List<String> strings = new ArrayList<>();
        strings.add("#products");
        productService.getProducts().forEach(product -> csvRow(product, strings));
        try {
            Files.write(getPath(), strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void csvRow(Product product, List<String> strings) {
        strings.add(String.join(",", product.getId().toString(), product.getName(),
                product.getPrice().toPlainString(),
                product.getCategories().name(),
                product.getBrand().name()));
    }

    private void load() {
        if (!Files.exists(getPath()))
            return;
        Collection<Product> products;
        try (Stream<String> lines = Files.lines(getPath())) {
            products = lines.skip(1).map(this::createProduct).toList();
            productService.addProducts(products);
        } catch (IOException e) {
            System.out.println("Error loading from file");
        }
    }

    private Product createProduct(String line) {
        String[] arr = pattern.split(line);
        return new Product(UUID.fromString(arr[0]), arr[1], new BigDecimal(arr[2]), Category.of(arr[3]), Brand.of(arr[4]));
    }

    private void printMenu() {
        System.out.println("1. Skapa ny produkt");
        System.out.println("2. Lista produkter");
        System.out.println("3. Ta bort produkt");
        System.out.println("4. Sök efter produkt");
        System.out.println("5. Öka lager för produkt");
        System.out.println("e. Avsluta");
    }

    private String getChoice() {
        return scanner.nextLine();
    }

    private boolean executeChoice(String choice) {
        boolean continueApplication = true;
        switch (choice) {
            case "1" -> createNewProduct();
            case "2" -> productService.getProducts().forEach(System.out::println);
            case "3" -> removeProduct();
            case "4" -> search();
            case "e" -> continueApplication = false;
            default -> System.out.println("Input ej giltig");
        }
        return continueApplication;
    }

    private void changeInventory() {
        System.out.println("Vilken produkt vill du ändra antal i lager för?");
        UUID productID = UUID.fromString(scanner.nextLine());
        productService.getProduct(productID)
                .ifPresent(this::changeQuantity);
    }

    private void search() {
        System.out.println("Sök på produkter enligt kategori:");
        String categoryName = scanner.nextLine();
        productService.getByCategory(Category.of(categoryName))
                .forEach(System.out::println);
    }

    private void removeProduct() {
        productService.getProducts().forEach(System.out::println);
        System.out.println("Välj ett produkt att ta bort");
        UUID uuid = UUID.fromString(scanner.nextLine());
        productService.deleteProduct(uuid);
    }

    private void createNewProduct() {
        try {
            System.out.println("Ange namn:");
            String name = scanner.nextLine();

            System.out.println("Ange pris:");
            BigDecimal price = new BigDecimal(scanner.nextLine());

            System.out.println("Ange kategori: ");
            Category category = Category.of(scanner.nextLine());

            System.out.println("Ange märke: ");
            Brand brand = Brand.of(scanner.nextLine());

            Product product = new Product(UUID.randomUUID(), name, price, category, brand);
            productService.addProduct(product);

        } catch (NumberFormatException e) {
            System.out.println("Det gick inte att skapa en product");
        }
    }

    private void changeQuantity(Product product) {
        System.out.println("Hur många vill du lägga till(-ta bort)?");
        int quantity = Integer.parseInt(scanner.nextLine());
        if( quantity > 0)
            productService.increaseInventory(product, quantity);
        else
            productService.decreaseInventory(product,quantity);
    }
}
