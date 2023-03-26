
//      Пусть дан произвольный список целых чисел, удалить из него чётные числа
package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Ex_2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int j = 0; j < 6; j++) {
            a.add(new Random().nextInt(8));
        }

        System.out.println(a);
        a.removeIf(num -> num % 2 == 0);
        System.out.println(a);

    }
}
