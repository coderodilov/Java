package bolean;
import java.util.Scanner;

// 03.12.2022
// Coder Odilov
// Boolean A va B sonlari berilgan ulardan biri toq no'lsa  true aks holda false qiymat qaytarsin

public class Boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();

        boolean tester;

        tester = (!(a % 2 == 0) || !(b % 2 == 0));

        System.out.println(tester);

    }
}
