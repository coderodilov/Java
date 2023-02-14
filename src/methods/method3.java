package methods;
// Coder Odilov
// 10.11.2022
// Sonlardi o'rta arifmetigi va geometrigini aniqlovchi funksiya

import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();

        System.out.println("Orta arifmetigi = " + mean(a, b));
        System.out.println("Orta geometigi = " + geometrigi(a, b));

    }

    static int mean(int a, int b) {
        a = (a + b) / 2;
        return a;
    }

    static double geometrigi(double a, double b) {
        a = Math.sqrt(a * b);
        return a;
    }
}
