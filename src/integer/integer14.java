package integer;
// Coder Odilov
// 17.10.2022
// Berilgan 2 xonali sondi 2ga bolingandagi qoldiq qismini aniqlang

import java.util.Scanner;

public class integer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, qoldiq;

        System.out.println("Sonni kiriting: ");
        num = scanner.nextInt();

        qoldiq = num % 2;

        System.out.println("Natija = " + qoldiq);
        scanner.close();
    }
}

