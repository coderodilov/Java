package integer;
// Coder Odilov
// 17.10.2022
// Berilgan yil qaysi yuz yillikka tegishli ekanini aniqlang

import java.util.Scanner;

public class integer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yil, asr;

        System.out.println("Yilni kiriting: ");
        yil = scanner.nextInt();

        asr = yil / 100 + 1;

        System.out.println("Siz " + asr + " chi yuz yillikni kiritdingiz");
        scanner.close();
    }
}

