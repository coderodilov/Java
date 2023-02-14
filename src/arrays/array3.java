package arrays;
//11.26.2022
//Coder Odilov
//Massiv elementlari orasidanberilgan raqam va uning indexsi aniqlansin!

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {
                2, 3, 5, 4, 6, 14, 9, 10, 1, 7, 11, 15, 13, 12
        };
        int index = -1;
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d,", array[i]);

        }
        System.out.println();
        System.out.print("Enter the number (1 <= 15): ");
        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                index = i;
            }
        }
        System.out.printf("'%d' massivning '%d'- indeksida joylashgan!", num, index);
    }
}
