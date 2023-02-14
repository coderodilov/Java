package strings;
//29.11.2022
//Coder odilov
//String indexOf & replace & trim

public class String2 {
    public static void main(String[] args) {

        String text = "     This is an apple. The apple is green. I have 2 apples    ";
        System.out.println(text);

        //Replacing.....
        System.out.println("after replacing.....");
        System.out.println(text.replace("apple", "banana"));

        //Trimming spaces.....
        System.out.println("after replacing.....");
        System.out.println(text.trim());
    }
}
