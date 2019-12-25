package day21;

public class NestedLoop_OddNumber {
    public static void main(String[] args) {

      /*
* // count from 1 to 10 --> print only odd numbers
*
 // repeat this 4 times
* */

        for (int i = 1; i <= 4; i++) {
            System.out.println("Iteration: " + i);

            for (int x = 1; x <= 10; x++) {
                if (x % 2 == 1) {

                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
