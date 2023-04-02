package org.example.seminar2.task2;

public class Participant implements Movement{
    private String name;
    private Integer length;
    private Integer height;

    public Participant(String name, Integer length, Integer height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean run(Integer length) {
        if (this.length >= length) {
            System.out.println(this.name + " пробежал " + length);
            return true;
        }
        else{
            System.out.println(this.name + " не пробежал " + length);
            return false;
        }
    }

    @Override
    public boolean jump(Integer height) {
        if (this.height >= height) {
            System.out.println(this.name + " перепрыгнул " + height);
            return true;
        }
        else{
            System.out.println(this.name + " не перепрыгнул " + height);
            return false;
        }
    }
}
