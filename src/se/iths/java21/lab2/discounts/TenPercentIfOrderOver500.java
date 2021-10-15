package se.iths.java21.lab2.discounts;

import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public class TenPercentIfOrderOver500 implements Discount {

    @Override
    public BigDecimal discount(List<Product> products) {
        var sum = products.stream().map(Product::getPrice)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        if (sum.doubleValue() > 500.0)
            return sum.multiply(new BigDecimal("0.1"));
        return BigDecimal.ZERO;
    }
}