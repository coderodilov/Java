package bolean;
import java.util.Scanner;

// 03.12.2022
// Coder Odilov
// Boolean agar Number = toq son bo'lsa true aks holda false qiymat qaytarsin

public class Boolean2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        boolean tester;

        tester = !(num % 2 == 0);

        System.out.println(tester);

    }
}
