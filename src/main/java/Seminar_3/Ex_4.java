
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex_4 {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(1);
        a.add(5);
        a.add(4);
        a.add(1);
        a.add(2);
        a.add(6);
        a.add(4);

        System.out.println(a);
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(3);
        b.add(6);
        b.add(9);
        b.add(7);
        b.add(4);
        System.out.println(b);

        b.removeAll(a);
        b.addAll(a);
        Collections.sort(b);

        System.out.println(b);
    }

}
