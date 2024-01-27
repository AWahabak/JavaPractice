package Class003;

public class IfStatmentsMore {

    public static void main(String[] args) {


//        if (testscore >= 90)
//            System.out.print('A');
//        if (testscore >= 80)
//            System.out.print('B');
//        if (testscore >= 70)
//            System.out.print('C');
//        if (testscore >= 60)
//            System.out.print('D');
//        else
//            System.out.print('E');



        int testscore = 76;
        if (testscore >= 90)
            System.out.print('A');
        else if (testscore >= 80)
            System.out.print('B');
        else if (testscore >= 70)
            System.out.println('C');
        else if (testscore >= 60)
            System.out.print('D');
        else
            System.out.print('E');

        if (testscore >= 90) System.out.print('A');
        else if (testscore >= 80) System.out.print('B');
        else if (testscore >= 70) System.out.println('C');
        else if (testscore >= 60) System.out.print('D');
        else System.out.print('E');

        if (testscore >= 90) {
            System.out.print('A');
            System.out.println("great work");
        }
        else if (testscore >= 80) {System.out.print('B');}
        else if (testscore >= 70) {System.out.println('C');}
        else if (testscore >= 60) {System.out.print('D');}
        else System.out.print('E');

    }


}
