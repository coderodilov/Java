package arrays;
//11.26.2022
//Coder Odilov
//Massiv elementlari yigindisini toping!

public class array2 {
    public static void main(String[] args) {
        int array[] = {
            2, 5, 3, 8, 11, 22, 15
        } ;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.printf("Massiv elementlar yig'indisi %d ga teng!", sum);
    }
}
