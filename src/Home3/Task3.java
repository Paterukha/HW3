package Home3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);

        System.out.print("Введите размер массива-");
        int x = size.nextInt();

        Scanner arrey = new Scanner(System.in);

        System.out.println("Введите массив чисел: ");
        int[] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            a[i] = arrey.nextInt();
        }

        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) min = a[i];
        }

        System.out.println("Минимальное число массива- " + min);


        int max = a[0];
        {

            for (int i = 0; i < a.length; i++) {

                if (a[i] > max)
                    max = a[i];
            }

            System.out.println("Максимальное число массива- " + max);

        }

        int y = 5;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5)
                j++;
        }

        System.out.println("Количество повторений числа 5 = " + j);

        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int time = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = time;
                }

            }


        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
