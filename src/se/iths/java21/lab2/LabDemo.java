package se.iths.java21.lab2;

import java.util.Scanner;

public class LabDemo {
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

    private void load() {


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
        System.out.println("e. Avsluta");
    }
    private String getChoice(){
        return scanner.nextLine();
    }

    private boolean executeChoice(String choice){
        boolean continueApplication = true;
        switch (choice){
            case "1" -> createNewProduct();
            case "2" -> productService.getProducts().forEach(System.out::println);
            case "3" -> removeProduct();
            case "4" -> search();
            case "e" -> continueApplication = false;
            default -> System.out.println("Input ej giltig");
        }
        return continueApplication;
    }

    private void search() {

    }

    private void removeProduct() {

    }

    private void createNewProduct() {

    }
}
