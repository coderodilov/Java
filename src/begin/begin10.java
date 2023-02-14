package begin;
// Coder Odilov
// 16.10.2022
// Tog'ri 4 burchakning  tomonlari a va b berilgan uning yuzi va perimetiri aniqlansin

import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b, s, p;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        s = a * b;
        p = 2 * (a + b);

        System.out.println("S = " + s);
        System.out.println("P = " + p);
        scanner.close();
    }
}
