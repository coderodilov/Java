package integer;
// Coder Odilov
// 16.10.2022
// Faylning hajmi bayt da berilgan uning hajmini to'liq kilobaytlarda aniqlang (1kb = 1024byte)

import java.util.Scanner;

public class integer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int byt, kb;

        System.out.print("Byte = ");
        byt = scanner.nextInt();

        kb = byt / 1024;

        System.out.println("KB = " + kb);
        scanner.close();
    }
}
