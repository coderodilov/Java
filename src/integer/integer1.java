package integer;
// Coder Odilov
// 16.10.2022
// uzunlik L sm da berilgan uni to'liq metrlar sonini aniqlansin M = L / 100

import java.util.Scanner;

public class integer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l, m;

        System.out.print("L = ");
        l = scanner.nextInt();

        m = l / 100;

        System.out.println("M = " + m);
        scanner.close();
    }
}
