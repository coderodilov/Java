package integer;
// Coder Odilov
// 17.10.2022
// uch xonali butun son berilgan ularni sonlar yig'indisini aniqlovchi dastur tuzilsin

import java.util.Scanner;

public class integer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, sum, temp;

        System.out.println("3 xonali butun son kiriting: ");
        a = scanner.nextInt();

        temp = a % 100;
        sum = a / 100 + temp / 10 + temp % 10;

        System.out.println("Sonlar yig'indisi " + sum);
        scanner.close();
    }
}
