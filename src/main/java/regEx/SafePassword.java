package regEx;

import java.util.Scanner;

public class SafePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String input = scan.nextLine();
        String regExCap = ".*[A-Z]+.*";
        String regExSm = ".*[a-z]+.*";
        String regExDig = ".*[0-9]+.*";
        String regExQuan = ".{12,}";
        boolean isHardToCrack = input.matches(regExCap) && input.matches(regExSm) &&
                input.matches(regExDig) && input.matches(regExQuan);
        if (isHardToCrack) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}