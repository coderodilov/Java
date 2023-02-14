package bolean;
import java.util.Scanner;

// 03.12.2022
// Coder Odilov
// Boolean agar Num > 0 bo'lsa true aks holda false qiymat qaytarsin

public class Boolean1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ( -120 - 120 )");
        int num = scanner.nextInt();

        boolean tester;

        tester = (num > 0);

        System.out.println(tester);

    }
}
