package methods;
// Coder Odilov
// 10.11.2022
// Doiraning yuzini hisoblovchi funskiya yarating! Doira yuzi S = Pi * R * R

import java.util.Scanner;

public class method5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius = ");
        double a = scanner.nextDouble();

        System.out.println("S = " + doiraYuzi(a));

    }

    static double doiraYuzi(double s) {
        double pi = 3.14;
        s = (pi * (s * s));
        return s;
    }
}
