package org.example.seminar2.task2;

public class Wall extends Obstacle{
    private Integer height;

    public Wall(Integer height) {
        this.height = height;
    }
    public Wall() {
        this.height = 5;
    }

    @Override
    Integer getInfo() {
        return this.height;
    }
}
