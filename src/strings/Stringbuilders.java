package strings;

public class Stringbuilders {
    public static void main(String[] args) {

        String card = "8600160422558505";

        StringBuilder builder = new StringBuilder();
        builder.append(card.substring(0,2));
        builder.append("** **** **** **");
        builder.append(card.substring(14));
        card = builder.toString();
        System.out.println(card);
    }
}
