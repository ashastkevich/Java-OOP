package org.example.seminar4.task1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> list) {
        Double summa = 0.0;
        for (Number num : list) {
            summa += num.doubleValue();
        }
        return summa;
    }
    public Double mult(List<? extends Number> list) {
        Double mult = 1.0;
        for (Number num : list) {
            mult *= num.doubleValue();
        }
        return mult;
    }
    public Double division(List<? extends Number> list) {
        Double div = 1.0;
        for (Number num : list) {
            div /= num.doubleValue();
        }
        return div;
    }
    public List<String> binary(List<Integer> list) {
        ArrayList<String> resList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resList.add(Integer.toBinaryString(list.get(i)));
        }
        return resList;
    }

}
