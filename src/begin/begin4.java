package begin;
// Coder Odilov
// 16.10.2022
// 2 ta son berilgan ularni kopaytmasi, yig'indisi va har birining kvadrati aniqlansin

import java.util.Scanner;

public class begin4 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        // Yig'indisi
        System.out.println("a + b = " + (a + b));

        // Ko'paytmasi
        System.out.println("a * b = " + (a * b));

        // a ning kvadrati
        System.out.println("a * a = " + (a * a));

        // b ning kvadrati
        System.out.println("b * b = " + (b * b));
        scanner.close();
    }
}
