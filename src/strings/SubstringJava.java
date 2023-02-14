package strings;
public class SubstringJava {
    public static void main(String[] args) {
        System.out.println(makeOutWord("{{}}", "Hello World"));
    }
    public static String makeOutWord(String out, String word){
        return out.substring(0,2) + word + out.substring(2,4);
    }
}
