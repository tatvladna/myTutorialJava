package shop;

import java.util.*;

public class Basket {

    private List<Product> basket = new ArrayList<>();


    public void addProduct(Product product) {
        basket.add(product);
        System.out.println(product.getName() + " добавлен в корзину.");
    }


    @Override
    public String toString() {
        if (basket.isEmpty()) {
            return "Корзина пуста.";
        }
        String result = "Ваша корзина состоит из:\n";
        for (Product product : basket) {
            result += "- " + product.getName() + " - цена: " + product.getPrice() + ", рейтинг: " + product.getRating() + "\n";
        }
        return result;
    }
}
