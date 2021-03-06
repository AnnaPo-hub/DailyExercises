package multi.dimensional.array;

public class MultiDimensionalArray {
    /** A method creates a matrix from n*n elements by filling it with  "." and "*".
     * The method forms the star figure and outputs the matrix.
     *
     * @param input odd number , more than 3, not exceeding 15
     */

    public void makeMatrixWithStar(int input){
        String[][] star = new String[input][input];
        int starMiddle = input / 2;
        String dot = ".";
        String asterix = "*";

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == j || i == starMiddle || j == starMiddle) {
                    star[i][j] = asterix;
                } else {
                    star[i][j] = dot;
                }
                star[i][star.length - i - 1] = asterix;
            }
        }

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
