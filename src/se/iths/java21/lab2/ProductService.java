package se.iths.java21.lab2;

import se.iths.java21.lab2.entities.Category;
import se.iths.java21.lab2.entities.Product;

import java.util.*;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
    }

    public void addProducts(Collection<Product> products){
        this.products.addAll(products);
    }

    public void addProduct(Product product) {
        if (products.contains(product))
            return;
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void deleteProduct(UUID uuid) {
        products.stream()
                .filter(product -> product.getId().equals(uuid))
                .findFirst()
                .ifPresent(products::remove);
    }

    public List<Product> getProducts() {
        return List.copyOf(products);   //Returns unmodifiable List as a copy.
        //return Collections.unmodifiableList(products);  //Returns unmodifiable List with read through
    }

    public Optional<Product> getProduct(UUID uuid) {
        return products.stream()
                .filter(product -> product.getId().equals(uuid))
                .findAny();
    }

    public List<Product> getByCategory(Category category) {
        return products.stream().
                filter(product -> product.getCategories().equals(category))
                .toList();
    }
}
