package Class007;

public class D1Array06 {
    public static void main(String[] args) {

        boolean[] flags = {true, false, true, false, false, true, true};
/*
write a loop to count how many values in above array are false
*/
        int count = 0;
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                count++;
            }
        }
        System.out.println("the total of false " + count);

//to get the count of true(s)
        int count2 = 0;
        for (int j = 0; j < flags.length; j++) {
            if (flags[j]) {
                count2++; // this is a counter
            }
        }
        System.out.println("The total of true " + count2+".");


    }
}
