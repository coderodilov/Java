package integer;
// Coder Odilov
// 17.10.2022
// Kun boshlangandan beri n sekund vaqt o'tdi kun mobaynida qancha to'liq soat vaqt o'tganini aniqlang

import java.util.Scanner;

public class integer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sekund, soat;

        System.out.println("vaqtni sekundlarda kiriting: ");
        sekund = scanner.nextInt();

        soat = (sekund / 60) / 60;

        System.out.println("Natija " + soat);
        scanner.close();
    }
}

