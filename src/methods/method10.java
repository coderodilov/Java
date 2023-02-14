package methods;
// Coder Odilov
// 21.11.2022
// n > 0 butun son berilgan shu sondi tub ekanini aniqlovchi metod hosil qling!
// shu songacha bo'lgan tub sonlar sonini aniqlang

import java.util.Scanner;

public class method10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= a; i++){
            if (isPrime(i)){
                count++;
            }
        }

        System.out.println("N songacha " + count + " ta tub son bor");

    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
