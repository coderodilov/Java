package methods;
// Coder Odilov
// 10.11.2022
// Berilgan son 0 dan kichik bolsa manfiy katta bolsa musbat va teng bolsa nolga teng deb chqaruvchi funksiya yarating

import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        ishora(a);

    }

    static void ishora(int a){
        if (a > 0){
            System.out.println("Musbat");
        } else if (a < 0) {
            System.out.println("Manfiy");
        } else System.out.println("Nolga teng");
    }
}
