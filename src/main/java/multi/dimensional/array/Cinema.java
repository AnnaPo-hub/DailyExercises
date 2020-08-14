package multi.dimensional.array;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // quantity of rows from the input;
        int m = scan.nextInt();  //quantity of seats from the input;
        scan.nextLine();
        String[][] cinema = new String[n][m];
        for (int i = 0; i < cinema.length; i++) {
            final String input = scan.nextLine();
            String newInput = input.replace(" ", "");
            for (int j = 0; j < newInput.length(); j++) {
                final char c = newInput.charAt(j);
                String str = String.valueOf(c);
                cinema[i][j] = str;
            }
        }
        int quantityOfTicketNeeded = scan.nextInt();
        final int i = checkEmptyPlace(cinema, quantityOfTicketNeeded, m);
        System.out.println(i);
    }

    /**
     *
     * @param cinema has n rows, each row consists of @param m seats (n and m do not exceed 20).
     * The two-dimensional matrix stores the information on the sold tickets, number 1 means that the ticket for this place is already sold,
     * the number 0 means that the place is available
     *  You want to buy @param quantityOfTicketNeeded tickets to the neighboring seats in the same row.
     * @return the number of the row with k consecutive available seats
     *  If there are several rows with k available seats, output the first row with these seats.
     *  If there is no such a row, output the number 0.
     */

    public static int checkEmptyPlace(String[][] cinema, int quantityOfTicketNeeded, int m) {
        int maxIndex = m - 1;
        int count = 1;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < m; j++) {
                if (cinema[i][j].equals("0")) {
                    if (count == quantityOfTicketNeeded) {
                        return i + 1;
                    }
                    if (cinema[i][j].equals("0") && j == maxIndex && quantityOfTicketNeeded > 1)
                        break;
                    int z = j;
                    int restOfPlaceInRow = m - z;
                    if (restOfPlaceInRow >= quantityOfTicketNeeded) {
                        for (int k = 0; k < quantityOfTicketNeeded; k++) {
                            if (cinema[i][z].equals(cinema[i][++z])) {
                                count++;
                            } else {
                                count = 1;
                                break;
                            }
                            if (count == quantityOfTicketNeeded) {
                                return i + 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
