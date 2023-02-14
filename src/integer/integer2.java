package integer;
// Coder Odilov
// 16.10.2022
// Og'irlik M klogramda berilgan undagi to'liq tonnalar T aniqlansin T = M / 1000

import java.util.Scanner;

public class integer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, m;

        System.out.print("M = ");
        m = scanner.nextInt();

        t = m / 1000;

        System.out.println("M = " + t);
        scanner.close();
    }
}
