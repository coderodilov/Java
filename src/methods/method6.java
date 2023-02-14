package methods;
// Coder Odilov
// 21.11.2022
// To'g'ri burchakli 3 burchakning katetlari A va B berilgan uning perimetri aniqlovchi metod yarating

import java.util.Scanner;

public class method6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.println("3 burchak perimetri : " + trianglePerimeter(a, b));
    }

    static int trianglePerimeter(int a, int b) {
        int g, s;
        g = (a * a) + (b * b);
        s = g + a + b;
        return s;
    }
}
