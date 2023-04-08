package org.example.seminar4.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> dls = new ArrayList<>();
        List<Integer> ils = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dls.add((double) i);
            ils.add(i);
        }
        System.out.println(calculator.sum(dls));
        System.out.println(calculator.sum(ils));
        System.out.println(calculator.mult(dls));
        System.out.println(calculator.mult(ils));
        System.out.println(calculator.division(dls));
        System.out.println(calculator.division(ils));
        System.out.println(calculator.binary(ils));
    }

}
