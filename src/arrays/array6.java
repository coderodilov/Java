package arrays;
//11.26.2022
//Coder Odilov
//Ko'p o'lchovli Massiv!

public class array6 {
    public static void main(String[] args) {

        int array[][] = {{10, 11, 12, 13}, {14, 15, 16, 17}, {18, 19, 20, 21}};

        showArray(array);

    }

    static void showArray(int array[][]){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
