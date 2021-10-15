package se.iths.java21.lab2.discounts;

import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.List;

@FunctionalInterface
public interface Discount {
    BigDecimal discount(List<Product> products);
}
