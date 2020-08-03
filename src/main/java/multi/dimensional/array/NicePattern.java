package multi.dimensional.array;

import java.util.Scanner;

/**
 * In some design style, a 4x4 matrix pattern is considered looking pretty if it doesn't consist of a 2x2 matrix of the same color.
 * A method outputs "YES" if the 4x4 matrix is looking pretty, otherwise outputs "NO".
 */

public class NicePattern {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int ind = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            final String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                array[i][j] = input.substring(ind, ++ind);
            }
            ind = 0;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        final String s = checkIfPretty(array);
        System.out.println(s);
    }

    public static String checkIfPretty(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j].equals(array[i][j + 1]) && array[i][j].equals(array[i + 1][j]) && array[i][j].equals(array[i + 1][j + 1])) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}

