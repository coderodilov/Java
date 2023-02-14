package strings;

public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }

    public static String extraEnd(String word){
        int length = word.length();
        return word.substring(length - 2,length) + word.substring(length - 2,length) + word.substring(length - 2,length);
    }
}
