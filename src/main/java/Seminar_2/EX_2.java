package Seminar_2;

//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class EX_2 {
    public static void main(String[] args) {
        String s1= "geekbrains";
        String s2 = "sniarbkeeg";
        System.out.println(s1.equalsIgnoreCase(s2 =new StringBuilder(s2).reverse().toString()));
    }
}
