package strings;
//29.11.2022
//Coder odilov
//String startsWith & endsWith

public class String1 {
    public static void main(String[] args) {
        String wordList[] = {"Black", "Carry", "Candy", "Catch", "Candom", "Cansas", "Brush", "Cherry", "Hurry",};

        for (String word:wordList){
            if (word.startsWith("Ca")) {
                System.out.println(word + "- begins with 'Ca' ");
            }
        }

        System.out.println("====================");

        for (String word:wordList){
            if (word.endsWith("ry")) {
                System.out.println(word + "- ends with 'ry' ");
            }
        }
    }
}
