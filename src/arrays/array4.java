package arrays;
//11.26.2022
//Coder Odilov
//Massiv elementlari orasidan eng katta va eng kichik son aniqlansin!

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {
                5, 120, 50, 65, 78, 11
        };

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d,", array[i]);
        }
        System.out.println();

        System.out.printf("Eng katta qiymat: '%d' \nEng kichik qiymat: '%d' ", getMax(array), getMin(array));
    }

    static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
