package methods;
// Coder Odilov
// 10.11.2022
// Berilgan raqamni 3 darajasini aiqlovchi funksiya yarating

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("pow3(a) = " + pow3(a));

    }

    static int pow3(int a){
        a = a * a * a;
        return a;
    }
}
