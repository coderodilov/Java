package integer;
// Coder Odilov
// 16.10.2022
// A va B (A > B) musbat sonlar berilgan A kesmada B kesmani necha marta to'liq sig'dirish mumkinligi aniqlansin

import java.util.Scanner;

public class integer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.println("Sonlarni A > B shaklda kiriting! ");
        System.out.print("A = ");
        a = scanner.nextInt();
        System.out.print("B = ");
        b = scanner.nextInt();

        c = a / b;

        System.out.println("A kesmda B kesma " + c + " ta to'liq joylashadi");
        scanner.close();
    }
}
