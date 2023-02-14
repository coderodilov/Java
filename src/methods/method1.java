package methods;
// Coder Odilov
// 10.11.2022
// Berilgan raqamni teskarisiga aylantradigan funksiya method yarating!

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("Reversed Number = " + reversedNumber(a));

    }

    // Method Int qiymat qaytaradi return = qiymat qaytaradigan method
    static int reversedNumber(int a) {
        int sum = 0;
        while (a != 0) {
            int b = a % 10;
            sum = sum * 10 + b;
            a /= 10;
        }
        return sum;
    }
}
