package org.example.seminar2.task1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        human.run();
        cat.jump();
        robot.run();
        human.jump();
    }
}
