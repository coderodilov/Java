package bolean;

import java.util.Scanner;

// 03.12.2022
// Coder Odilov
// Boolean A va B son berilgan agar A >= 0 yoki B < -2 bo'lsa true aks holda false qiymat qaytarsin

public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();

        boolean tester;

        tester = (a >= 0 || b < -2);

        System.out.println(tester);

    }
}
