package org.example.seminar2.task1;

public class Cat implements Creature{

    @Override
    public void run() {
        System.out.println("Кошка бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
