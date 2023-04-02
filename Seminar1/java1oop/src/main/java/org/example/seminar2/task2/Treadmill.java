package org.example.seminar2.task2;

public class Treadmill extends Obstacle{
    private Integer length;

    public Treadmill(Integer length) {
        this.length = length;
    }

    public Treadmill() {
        this.length = 10;
    }


    @Override
    Integer getInfo() {
        return this.length;
    }
}
