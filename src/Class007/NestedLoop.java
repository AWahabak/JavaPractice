package Class007;

public class NestedLoop {

    public static void main(String[] args) {

        /*
       Placing one loop inside the body of another loop is called nesting.
● When we "nest" two loops, the outer loop takes control of the number of complete repetitions of the inner loop.
● While all types of loops may be nested, the most commonly nested loops are for loops.

         */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " " + j);
            }
        }

 /*
 1 1
 1 2
 1 3
 1 4
 1 5
 2 1
 2 2
 2 3
 2 4
 2 5
 .....
  */


    }
}
