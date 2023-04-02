package org.example;

public class User {
    String login;
    String password;
    Basket userBasket = new Basket();

    /**
     *
     * @param login
     * @param password
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userBasket=" + userBasket +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }
    public void buy(Product product, int qty) {
        this.userBasket.setProducts(product);
        product.buy(qty);
    }
}
