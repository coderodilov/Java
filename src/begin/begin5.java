package begin;
// Coder Odilov
// 16.10.2022
// Doiraning radiusi R berilgan uning uzunligi L topilsin

import java.util.Scanner;

public class begin5 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        double r, l, s, Pi = Math.PI;

        System.out.print("r = ");
        r = scanner.nextDouble();

        l = 2 * Pi * r;
        s = Pi * (r * r);

        System.out.println("L = " + l);
        System.out.println("S = " + s);
        scanner.close();
    }
}
