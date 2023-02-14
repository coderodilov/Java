package begin;
// Coder Odilov
// 16.10.2022
// 2 ta manfiy bo'lmagan son berilgan ularni o'rta geometrigi aniqlansin

import java.util.Scanner;

public class begin3 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        int c = (int) Math.sqrt(a * b);

        System.out.println("a va b ning o'rta geometrigi: " + c);
        scanner.close();
    }
}
