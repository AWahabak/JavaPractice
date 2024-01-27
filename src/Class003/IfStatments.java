package Class003;

public class IfStatments {
    public static void main(String[] args) {

        /*
        Syntax
        if (condition) {
            instruction, block of code
            What should be executed
        }
         */

        /*
        if(3>2){
            System.out.println("Yes the first value is greater than the second value");
            //block code
            //block code1
            //block code2
        }
        */

        int num1, num2;
        num1=30;
        num2=25;

//        if(num1>=40){ //output true/false "boolean"
//            System.out.println("Yes the first value is greater than the second value");
//            //block code
//            //block code1
//            //block code2
//        }

        //you want to go to town, if you used bicyle it will take 40 minutes, but if you use car it will tkae 7 minutes
        String vehicle1 = "car";
        String vehicle2 = "cycle";

//        if(vehicle2=="car"){ //true/false
//            System.out.println("you don't have to go earlier");
//        }

        /*
        if(Boolean_expression) {
            // Executes when the Boolean expression is true
        }else {
            // Executes when the Boolean expression is false
        }
         */
        if(vehicle1=="car"){ //false
            System.out.println("you don't have to go earlier"); // --> output 1 when true
        } else { // if false or if the condition does not meet
            System.out.println("you have to startup earlier to get there on time"); // --> output 2 when false
        }


        if(2>1) System.out.println("yes it is greater");


        if(2<5) {
            System.out.println("Yes ok");
            System.out.println("Yes ok");
            System.out.println("Yes ok");
            System.out.println("Yes ok");
        }

    }
}
