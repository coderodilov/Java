package begin;
// Coder Odilov
// 16.10.2022
// To'gri burchakli 3 burchakning katetlari a va b berilgan uning gipatenuzasi aniqlansin

import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("b = ");
        b = scanner.nextDouble();

        c = Math.hypot(a, b);

        System.out.println("Gipotenuzasi c = " + c);
        scanner.close();
    }
}
