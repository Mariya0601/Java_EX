package Seminar_3;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex_3 {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int j = 0; j < 6; j++) {
            b.add(new Random().nextInt(8));
        }
        System.out.println(b);
        System.out.println(Collections.max(b));
        System.out.println(Collections.min(b));

    }
}
