package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product notebook = new Product("Notebook", 100, 7, 10);
        Product mouse = new Product("Mouse", 10, 8, 10);
        Product keyboard = new Product("Keyboard", 20, 9, 10);
        Product monitor = new Product("Monitor", 50, 10, 10);
        Product printer = new Product("Printer", 60, 8, 10);
        Product scanner = new Product("Scanner", 60, 9, 10);
        Product webcam = new Product("WebCam", 15, 8, 10);
        Category computers = new Category("Computers",
                new ArrayList<>(Arrays.asList(notebook, mouse, keyboard, monitor)));
        Category accessories = new Category("Accessories",
                new ArrayList<>(Arrays.asList(printer, scanner, webcam)));
        User user1 = new User("User1", "pass1");
        User user2 = new User("User2", "pass2");

        for (Product elem : computers.products) {
            System.out.println(elem);
        }
        for (Product elem : accessories.products) {
            System.out.println(elem);
        }
        user1.buy(notebook, 2);
        user2.buy(mouse, 3);
        user2.buy(monitor, 1);
        System.out.println("----------");
        System.out.println(user1.login);
        System.out.println(user1.userBasket);
        System.out.println(user1.login);
        System.out.println(user2.userBasket);
        System.out.println("----------");

        for (Product elem : computers.products) {
            System.out.println(elem);
        }
        for (Product elem : accessories.products) {
            System.out.println(elem);
        }

    }
}