package Seminar_3;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Ex_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        compare(list);


    }
    public static void compare(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(9);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        });

        System.out.println(array);
        list.forEach(n -> System.out.print(n + ","));
    }


}

