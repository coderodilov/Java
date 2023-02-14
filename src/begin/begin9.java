package begin;
// Coder Odilov
// 16.10.2022
// Kvadratning tomoni a berilgan uning yuzi aniqlansin

import java.util.Scanner;

public class begin9 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int a, s;

        System.out.print("a = ");
        a = scanner.nextInt();

        s = a * a;

        System.out.println("S = " + s);
        scanner.close();
    }
}
