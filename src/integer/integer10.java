package integer;
// Coder Odilov
// 17.10.2022
// uch xonali butun son berilgan chapdan birinchi sonni o'chrib o'nga yozilganda hosil bo'lgan son aniqlansin

import java.util.Scanner;

public class integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, num, temp;

        System.out.println("3 xonali butun son kiriting: ");
        a = scanner.nextInt();

        temp = a % 100;
        num = temp * 10 + a / 100;

        System.out.println("Natija " + num);
        scanner.close();
    }
}