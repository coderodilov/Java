package methods;
// Coder Odilov
// 21.11.2022
// Berilgan sonni juft yoki toq ekanini aiqlovchi metdo hosil qling juft bolsa true aksincha bolsa false qiymat qaytarsin

import java.util.Scanner;

public class method9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.println(isJuft(a));

    }

    static boolean isJuft(int a) {
        boolean isjuft = false;
        if (a % 2 == 0){
            isjuft = true;
        }
        return isjuft;

    }
}
