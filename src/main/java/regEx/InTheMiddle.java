package regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InTheMiddle {
    /**
     * The first line of the input contains a sequence of letters.
     * The second line of the input contains some text.
     * A method determines is any of the words of this text start or end  with the sequence specified in the first line of the input.
     * if there is, the method outlines "YES", otherwise outputs "NO".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        String regDot = ".*";
        String regB = "\\b";
        String endRegex = regDot + part + regB;
        String beginningRegex = regB + part + regDot;
        Pattern pattern1 = Pattern.compile(endRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern1.matcher(line);
        Pattern pattern2 = Pattern.compile(beginningRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(line);
        if (matcher.find() || matcher2.find())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

