// Пусть дан произвольный список из 100 целых чисел.

// 1) Нужно удалить из него чётные числа
// program3_1
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;

public class program3 {
    public static void main(String[] args) throws Exception {
        Random ran = new Random();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            int x = ran.nextInt(-100, 100);
            ar.add(x);
        }
        System.out.printf("Первоначальный список %s\n", ar);
        int i = 0;
        while (i < ar.size()) {
            if (ar.get(i) % 2 == 0) {
                ar.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", ar);
    }
}