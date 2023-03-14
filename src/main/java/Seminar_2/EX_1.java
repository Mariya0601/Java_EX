package Seminar_2;

public class EX_1 {
    public static void main(String[] args) {
        String str1 = "Geekbrains";
        String str2 = "geekbrains";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
