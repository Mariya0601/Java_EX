package Seminar_6;

import Seminar_6.MySet;

public class Sem_6 {
    public static void main(String[] args) {
        MySet ms = new MySet();
        ms.add(1);
        ms.add(2);
        ms.add(3);
        ms.add(4);
        ms.add(5);
        ms.add(6);
        ms.print();
        System.out.println( ms.toList());
    }
}
