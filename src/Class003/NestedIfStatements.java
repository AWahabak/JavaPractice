package Class003;

public class NestedIfStatements {

    public static void main(String [] args){

        //Age verification for work eligibility
        //if < 18 then teenager
        //if >=18 till 64 eligible for work
        //if >64 then retired


        int age=67;
        if(age<18){
            System.out.println("You are a teenager, no need to work or find a job");
        } else {
            System.out.println("You are 18 or older than 18");
            if(age>64) {
                System.out.println("You are eligible to work");
            } else {
                System.out.println("Enjoy your life");
            }
        }

    }

}
