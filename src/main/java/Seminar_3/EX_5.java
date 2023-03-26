
package Seminar_3;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class EX_5 {

    public static void main(String[] args) {
        Object[] i;
        ArrayList<Integer> list5 = new ArrayList<>();
        thousand_null(list5);
        LinkedList<Integer> list6 = new LinkedList<>();
        thousand_zero(list6);

    }

    //Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
    public static void thousand_null(ArrayList<Integer> array) {
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list5.add(0, 0);
            System.out.println("List of 10000 zeros: " + list5);
        }
    }

    //Повторить пятый пункт но с LinkedList.
    public static void thousand_zero(LinkedList<Integer> list6) {
        for (int i = 0; i < 10000; i++) {
            list6.addFirst(0);
        }
        System.out.println("Linked list of 10000 zeros: " + list6);
//        Время работы LinkedList
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list6.addFirst(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (end - start) + " ms");

    }


}






