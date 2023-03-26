import java.util.Arrays;
import java.util.Random;

public class EX_1 {

    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

    public static void main(String[] args) {
        Random random = new Random();
        int i = new Random().nextInt(2000);
        System.out.println(i);

//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        System.out.println(Integer.highestOneBit(i));

//      3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (i % j == 0) {
                int[]m1=new int[]{j};
                for (int k = 0; k < m1.length;k++){
                    System.out.println(Arrays.toString(m1));
                }
            }
        }


//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

    }
}
