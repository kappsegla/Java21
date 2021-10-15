package se.iths.java21.lab2.discounts;

import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public class Buy10Get10Off implements Discount {
    @Override
    public BigDecimal discount(List<Product> products) {
        if (products.size() > 9)
            return BigDecimal.valueOf(10);
        return BigDecimal.ZERO;
    }
}
