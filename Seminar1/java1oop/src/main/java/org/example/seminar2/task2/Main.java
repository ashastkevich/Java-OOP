package org.example.seminar2.task2;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Wall(5),
                new Wall(9),
                new Treadmill(10),
                new Wall(15),
                new Wall(5),
                new Treadmill(9),
                new Wall(3),
                new Treadmill(10),
                new Treadmill(20),
                new Wall(18),
                new Wall(9),
                new Treadmill(11),
        };

        Participant[] participants = {
                new Participant("Alex",10,10),
                new Participant("Bob",7,15),
                new Participant("Ivan",20,8),
                new Participant("Max",23,24),
        };

        for (Participant p : participants) {
            System.out.println("Участник " + p.getName());
            for (Obstacle o : obstacles) {
                if (o instanceof Wall)
                    if (!p.jump(o.getInfo())) {
                        System.out.println("Участник " + p.getName() + " сошел с дистанции");
                        break;
                    }
                else
                    if (!p.run(o.getInfo())) {
                        System.out.println("Участник " + p.getName() + " сошел с дистанции");
                        break;
                    }
            }
        }
    }
}
