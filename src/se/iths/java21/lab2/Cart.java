package se.iths.java21.lab2;

import se.iths.java21.lab2.discounts.Buy10Get10Off;
import se.iths.java21.lab2.discounts.Discount;
import se.iths.java21.lab2.discounts.TenPercentIfOrderOver500;
import se.iths.java21.lab2.entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Cart {
    private final List<Product> products = new ArrayList<>();
    private final List<Discount> discounts = new ArrayList<>();
   // private final List<Function<List<Product>,BigDecimal>> discountList;

    public Cart() {
        discounts.add(new TenPercentIfOrderOver500());
        discounts.add(new Buy10Get10Off());
    }

    public void addToCart(Product product, int quantity) {
        products.addAll(Collections.nCopies(quantity, product));
    }

    public String createReceipt() {
        return "";
    }

    public BigDecimal totalPrice() {
        return BigDecimal.ZERO;
    }

    public Map<Product, Integer> quantityOfProduct() {
        return null;
    }

    public BigDecimal discount() {
        BigDecimal totalDiscount = BigDecimal.ZERO;
        for (var discount : discounts) {
            totalDiscount = totalDiscount.add(discount.discount(products));
        }
        return totalDiscount;
    }
}

