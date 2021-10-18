package se.iths.java21.lab2;

import org.junit.jupiter.api.Test;
import se.iths.java21.lab2.entities.Brand;
import se.iths.java21.lab2.entities.Category;
import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    ProductService productService = new ProductService();

    @Test
    void createProductServiceObjectThenExpectEmptyListFromGetProducts(){
        //Act
        var result = productService.getProducts();
        //Assert
        assertEquals(0, result.size());
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
        assertEquals(1,result.size());
        assertEquals(product, result.get(0));
    }
}