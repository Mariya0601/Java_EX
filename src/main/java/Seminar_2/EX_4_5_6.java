package Seminar_2;
//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
public class EX_4_5_6 {
    public static void main(String[] args) {
        int a =3;
        int b =56;
        StringBuilder builder = new StringBuilder();
        builder.append(a).append("+").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append("-").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append("*").append(b).append(" = ").append(a + b).append("\n");

        System.out.println(builder);

//    Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        int position;
        while ((position = builder.indexOf("=")) != -1) {
            builder.deleteCharAt(position);
            builder.insert(position,"равно");
        }
        System.out.println(builder);

//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}
