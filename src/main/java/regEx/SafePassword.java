package regEx;

import java.util.Scanner;

public class SafePassword {

    /**
     * A methods checks whether the input through scanner parameter is a safe password.
     * return "YES" if a given input is the safe password and "NO" it is is not safe.
     */
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