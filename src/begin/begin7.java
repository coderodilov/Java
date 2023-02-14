package begin;
// Coder Odilov
// 16.10.2022
// A va B sonlari berilgan ularni qiymatlari almashtrilsin

import java.util.Scanner;

public class begin7 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b, temp;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        scanner.close();
    }
}
