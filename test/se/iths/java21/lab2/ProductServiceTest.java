package se.iths.java21.lab2;

import org.junit.jupiter.api.Test;
import se.iths.java21.lab2.entities.Brand;
import se.iths.java21.lab2.entities.Category;
import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ProductServiceTest {

    ProductService productService = new ProductService();

    @Test
    void createProductServiceObjectThenExpectEmptyListFromGetProducts() {
        //Act
        var result = productService.getProducts();
        //Assert
        //  assertEquals(0, result.size(),"Returned List should have length zero");
        assertThat(result).withFailMessage("List should be empty").isEmpty();
    }

    @Test
    void addProductShouldBeReturnedByGetProducts() {
        //Arrange
        Product product = new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"),
                "TestProduct",
                BigDecimal.TEN, Category.of("Test"), Brand.of("T"));
        //Act
        productService.addProduct(product);
        //Assert
        var result = productService.getProducts();
        //assertEquals(1,result.size(),"List should have one Product");
        //assertEquals(product, result.get(0),"Product should be equal to added Product");
        assertThat(result).isEqualTo(List.of(product)).isNotInstanceOf(ArrayList.class);
    }

    @Test
    void addSameProductTwiceShouldOnlyAddOneProduct() {
        Product product = new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"),
                "TestProduct",
                BigDecimal.TEN, Category.of("Test"), Brand.of("T"));

        productService.addProduct(product);
        productService.addProduct(product);

        var result = productService.getProducts();
        assertThat(result).isEqualTo(List.of(product));
    }

    @Test
    void getByCategoryShouldReturnListOfProductsOnlyFromThatCategory() {
        var listOfProducts = createProductList();
        productService.addProducts(listOfProducts);
        var result = productService.getByCategory(Category.of("Test"));
        assertThat(result).filteredOn(p -> p.getCategories() != Category.of("Test")).hasSize(0);
    }

    @Test
    void getByUUIDShouldReturnProduct() {
        productService.addProducts(createProductList());

        var result = productService.getProduct(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"));

        assertThat(result).contains(new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"), "Test1", BigDecimal.TEN, Category.of("Test"), Brand.of("then")));
    }

    @Test
    void deleteProductByUUIDShouldRemoveThatProductFromListOfProducts() {
        productService.addProducts(createProductList());

        productService.deleteProduct(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"));

        var result = productService.getProducts();
        assertThat(result).doesNotContain(new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"), "Test1", BigDecimal.TEN, Category.of("Test"), Brand.of("then")));
    }

    @Test
    void deleteProductByReferenceShouldRemoveThatProductFromListOfProducts() {
        productService.deleteProduct(new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"), "Test1", BigDecimal.TEN, Category.of("Test"), Brand.of("then")));

        var result = productService.getProducts();
        assertThat(result).doesNotContain(new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"), "Test1", BigDecimal.TEN, Category.of("Test"), Brand.of("then")));
    }

    @Test
    void callingDecreaseOnProductNotAwailableThrowsIllegalArgumentException() {
        Product product = new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"),
                "TestProduct",
                BigDecimal.TEN, Category.of("Test"), Brand.of("T"));
        //Junit5 assert
        assertThrows(IllegalArgumentException.class, ()->productService.decreaseInventory(product,1));
        //AssertJ
        assertThatThrownBy(()-> productService.decreaseInventory(product,1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void callingIncreaseShouldIncreaseInventory() {
        Product product = new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"),
                "TestProduct",
                BigDecimal.TEN, Category.of("Test"), Brand.of("T"));
        productService.increaseInventory(product,2);
        assertThat(productService.getInventory(product)).isEqualTo(2);
    }


    private List<Product> createProductList() {
        return List.of(
                new Product(UUID.fromString("1d62dd4c-dcfa-4d80-8c77-cda5f0166e35"), "Test1", BigDecimal.TEN, Category.of("Test"), Brand.of("then")),
                new Product(UUID.fromString("96d93931-86fe-4df4-94fe-c931e61073c9"), "Test2", BigDecimal.TEN, Category.of("NotTest"), Brand.of("samples")),
                new Product(UUID.fromString("8a0b8d17-f003-4f2e-9563-09fb422f0743"), "Test3", BigDecimal.TEN, Category.of("Test"), Brand.of("notes")));
    }
}