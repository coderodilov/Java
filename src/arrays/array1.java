package arrays;
//11.26.2022
//Coder Odilov
//Massiv elon qilish Massivlar

public class array1 {
    public static void main(String[] args) {
        String array[] = new String[5];

        array[0] = "Damas";
        array[1] = "Malibu";
        array[2] = "Tico";
        array[3] = "Tracker";
        array[4] = "Cobalt";

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
