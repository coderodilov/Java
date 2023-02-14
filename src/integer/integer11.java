package integer;
// Coder Odilov
// 17.10.2022
//  uch xonali butun son berilgan uni o'nliklar honasidagi sonni yuzliklar honasidagi  son bilan  almashtirilsins

import java.util.Scanner;

public class integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, bir, on, yuz, num;

        System.out.println("3 xonali butun son kiriting: ");
        a = scanner.nextInt();

        yuz = a / 100;
        on =  (a / 10) % 10;
        bir = a % 10;

        num = on * 100 + yuz * 10 + bir;

        System.out.println("Natija " + num);
        scanner.close();
    }
}

