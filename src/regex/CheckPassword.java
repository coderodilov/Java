package regex;
import java.util.Scanner;
import java.util.regex.Pattern;

//12.12.2022
//F11 with group
//Java regex checking password

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password");
        String password = scanner.nextLine();

        checkPassword(password);
    }
    public static void checkPassword(String password) {
        String lower = "[a-z]+";
        String upper = "[A-Z]+";
        String number = "[0-9]+";
        String symbol = "[~!@#$%^&*()_+{}\\\\\\\\[\\\\\\\\]:;,.<>/?-]+";

        String lowerSymbol = "[a-z~!@#$%^&*()_+{}\\\\\\\\[\\\\\\\\]:;,.<>/?-]+";
        String upperSymbol = "[A-Z~!@#$%^&*()_+{}\\\\[\\\\]:;,.<>/?-]+";
        String lowerNumber = "[a-z0-9]+";
        String upperLower = "[A-Za-z]+";
        String upperNumber = "[A-Z0-9]+";

        String strong = "[a-zA-Z0-9]+";

        if (Pattern.matches(lower, password) || Pattern.matches(upper, password)
                || Pattern.matches(number, password)
                || Pattern.matches(symbol, password)) {

            System.out.println("Weak!");

        } else if (Pattern.matches(lowerNumber, password) || Pattern.matches(upperNumber, password)
                || Pattern.matches(lowerSymbol, password)
                || Pattern.matches(upperSymbol, password) || Pattern.matches(upperLower, password)) {
            System.out.println("Good");

        } else if (Pattern.matches(strong, password)) {
            System.out.println("Strong");
        } else {
            System.out.println("Very strong");
        }
    }

}

// Weak 4545  || @#$@ || DSRD || dfesrf
// Good asdsa565 || DSD56565 || fgf%^% || GFG^%& ||
// Strong Asad45
// Very strong SAS454dwsd^%^&%
