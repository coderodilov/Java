package begin;
// Coder Odilov
// 16.10.2022
// A, B, C sonlari berilgan ularni qiymatlari  A = B ga, B = C ga va C = A ga almashtrilsin

import java.util.Scanner;

public class begin8 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, b, c, temp;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        System.out.print("c = ");
        c = scanner.nextInt();

        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        scanner.close();
    }
}
