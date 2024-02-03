package Class009;

public class EgContinue {
    public static void main(String[] args) {
        // to skip printing of values from 5 up to 9 and then continue as usual
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                 continue; // Here, the continue statement is executed when the value of i becomes more than 4 and less than 9.
            }
            System.out.println(i);
        }

    }
}
