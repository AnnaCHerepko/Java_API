import java.util.ArrayList;
import java.util.Random;


import static java.util.Collections.max;
import static java.util.Collections.min;

public class program3_1 {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            int x = ran.nextInt(-100, 100);
            ar.add(x);
        }
        System.out.printf("Первоначальный список %s\n", ar);
        int max = max(ar);
        int min = min(ar);
        int maxItem = ar.get(0);
        int minItem = ar.get(0);
        int sumItems = 0;
        for (int item : ar) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/ar.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Среднее значение %s\n", average);
    }
}
