package methods;
// Coder Odilov
// 21.11.2022
// calc degan metod yarating operation 1 "+", 2 "-", 3 "*", 4 "/" bolsin bunda operation int qabul qiladi;

import java.util.Scanner;

public class method8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        System.out.println("Select operation 1-4 \n1 '+' \n2 '+' \n3 '*' \n5 '/'");
        int operation = scanner.nextInt();

        System.out.println(calc(a, b, operation));
    }

    static int calc(int a, int b, int operation) {
        int s;
        switch (operation) {
            case 1:
                s = a + b;
                return s;
            case 2:
                s = a - b;
                return s;
            case 3:
                s = a * b;
                return s;
            case 4:
                s = a / b;
                return s;
            default:
                return 0;
        }

    }
}
