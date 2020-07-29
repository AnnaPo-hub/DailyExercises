import java.util.ArrayList;
import java.util.Scanner;

public class OrderedStatements {

    /**
     * The program reads a sequence entered by a user and outputs true if the sequence is ordered (is ascending or descending order),
     * otherwise, false. If a number has the same value as the following number, it does not break the order.
     * The sequence ends with 0, 0 is not a part of the sequence.
     */

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       Scanner scan = new Scanner(System.in);
       while (scan.hasNext()) {
           int input = scan.nextInt();
           if (input == 0)
               break;
           list.add(input);
       }
       Integer[] sequence = list.toArray(new Integer[list.size()]);
       int count = 0;
       while (true) {
           while (count <= sequence.length - 2 && sequence[count] <= sequence[++count]) ;
           if (count < sequence.length - 1 && count > 1) {
               System.out.println(false);
               break;
           }
           count = 0;
           while (count <= sequence.length - 2 && sequence[count] >= sequence[++count]) ;
           if (count < sequence.length - 1) {
               System.out.println(false);
               break;
           }
           if (count == sequence.length - 1)
               System.out.println("true");
           break;
       }
   }
}


