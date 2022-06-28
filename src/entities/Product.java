package entities;

import java.util.Objects;

public class Product {
    private Double product;
    private String name;

    public Product(Double product, String name) {
        this.product = product;
        this.name = name;
    }

    public Double getProduct() {
        return product;
    }

    public void setProduct(Double product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return product.equals(product1.product) && name.equals(product1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, name);
    }
}
