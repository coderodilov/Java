package integer;
// Coder Odilov
// 17.10.2022
// ikki xonali butun son berilgan ularni raqamlar o'rnini almashtiruvchi dastur tuzilsin

import java.util.Scanner;

public class integer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("2 xonali butun son kiriting: ");
        a = scanner.nextInt();

        b =  (a % 10) * 10 + (a / 10) ;

        System.out.println("Natija = " + b);
        scanner.close();
    }
}
