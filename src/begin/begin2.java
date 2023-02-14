package begin;
// Coder Odilov
// 16.10.2022
// a va b butun sonlari berilgan ularni o'rta arifmetigi topilsin

import java.util.Scanner;

public class begin2 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        c = (a + b) / 2;

        System.out.println("a va b ning o'rta arifmetigi: " + c);
        scanner.close();
    }
}
