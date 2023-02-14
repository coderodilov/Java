package methods;
// Coder Odilov
// 21.11.2022
// A va B butun sonlar orasidagi sonlar yig'indisini hisoblovchi sumRange nomli funksiya yarating!
// Agar A > B bolsa metod 0 qiymat qaytarsin!

import java.util.Scanner;

public class method7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.println(sumRange(a, b));
    }

    static int sumRange(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                sum += i;
            }
            return sum;
        } else
            return 0;
    }
}
