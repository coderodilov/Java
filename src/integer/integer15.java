package integer;
// Coder Odilov
// 17.10.2022
// Kun boshlangandan beri otgan vaqt sekunlarda berilgan uni soat va minutlarda korsating

import java.util.Scanner;

public class integer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sekund, minut;

        System.out.println("Vaqtni sekunlarda kiriting: ");
        sekund = scanner.nextInt();

        minut = sekund / 60;
        
        System.out.println("Natija = " + minut);
        scanner.close();
    }
}

