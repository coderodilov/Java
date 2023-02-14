package bolean;

import java.util.Scanner;

// 03.12.2022
// Coder Odilov
// Boolean A va B son berilgan agar A = 2 va B <= 3 bo'lsa true aks holda false qiymat qaytarsin

public class Boolean3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();

        boolean tester;

        tester = (a == 2 && b <= 3);

        System.out.println(tester);

    }
}
