package integer;
// Coder Odilov
// 17.10.2022
// uch xonali butun son berilgan ularni yuzlar sonini aniqlovchi dastur tuzilsin

import java.util.Scanner;

public class integer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("3 xonali butun son kiriting: ");
        a = scanner.nextInt();

        b =  a / 100 ;

        System.out.println("Yuzlar soni " + b);
        scanner.close();
    }
}
