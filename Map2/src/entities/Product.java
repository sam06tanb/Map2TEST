package entities;

import java.util.Objects;

public class Product {

   private String Product;
   private Double value;

    public Product(String product, Double value) {
        Product = product;
        this.value = value;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(Product, product.Product) && Objects.equals(value, product.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Product, value);
    }
}
