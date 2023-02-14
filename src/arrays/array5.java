package arrays;
//11.26.2022
//Coder Odilov
//Massiv elementlari o'sib borish taartibida saralansin!

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {
                5, 120, 50, 65, 78, 11, 0, 40, 5, 7
        };

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d,", array[i]);
        }
        System.out.println();

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d,", array[i]);
        }

    }
}
