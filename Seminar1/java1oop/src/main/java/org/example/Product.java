package org.example;

public class Product {
    String name;
    Integer price;
    Integer rating;
    Integer amount;
    public Product() {
    }

    /**
     *
     * @param name
     * @param price
     * @param rating
     * @param amount
     */
    public Product(String name, Integer price, Integer rating, Integer amount){
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public void buy(int amount){
        this.amount -= amount;
    }
}
