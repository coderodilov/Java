package begin;
// Coder Odilov
// 16.10.2022
// Kvadrat a tomoni berilgan uni perimetri topilsin

import java.util.Scanner;

public class begin1 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.println("Kvadrat Perimetri: " + a * 4);

        scanner.close();
    }
}
