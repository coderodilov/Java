package integer;
// Coder Odilov
// 17.10.2022
// ikki xonali butun son berilgan ularni raqamlar yigindisi aniqlanisn

import java.util.Scanner;

public class integer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, sum;

        System.out.println("2 xonali butun son kiriting: ");
        a = scanner.nextInt();

        sum = a / 10 + a % 10;

        System.out.println("Raqamlar yi'g'indisi = " + sum);
        scanner.close();
    }
}
