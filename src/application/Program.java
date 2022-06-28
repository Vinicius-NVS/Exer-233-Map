package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {


        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product(900.0, "Tv");
        Product p2 = new Product(1200.0, "notebook");
        Product p3 = new Product(400.0, "Tablet");

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product product = new Product(900.0, "Tv");

        System.out.println("Contains 'ps' key: " + stock.containsKey(product));

    }
}
