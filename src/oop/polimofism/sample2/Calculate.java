package oop.polimofism.sample2;
/*
 * Creator Coder Odilov
 * Created on 14/02/23
 */

public class Calculate {
    public static void main(String[] args) {
        Math math = new Math();

        System.out.println("Max(12 & 52) = " + math.getMax(12,52));
        System.out.println("Max(74 & 36 & 45) = " + math.getMax(74,36,45));
    }
}
