package Class002;

import java.util.Scanner;

public class Calc2 {

    public static void main(String[] args){

        int num10 = 10; // declare and intialize
//        int num2 = 15;
//        int num3 = 17;
        int number; //declare
        number=13; // intialize
        int num1=10, num2=15, num3=17;

        //nullpointer exception

        Scanner userInput = new Scanner(System.in);

        Scanner userTyping;
        userTyping= new Scanner (System.in);


        //System.out.println(2+2);
        //System.out.println(2+2+3+5);
        //System.out.println(num2+num1);
        //System.out.println(num2+num1+7);

//        System.out.println(2-2);
//        System.out.println(2-2+3-5);
//        System.out.println(num2*num1);
//        System.out.println(num2*num1/7);

        //System.out.println(5+5*10);
        //System.out.println((5+5)*10);

        // (  ), *, /, %, +, -

        //HW: build a basic calculator
        //which asks the user to enter two numbers with an operator

//        System.out.println(20%3); //2
//        System.out.println(18%3); //0
        //System.out.println(25%7);
        //System.out.println(20%2);
        //System.out.println(22%2);
        //module or remainder
        //System.out.println(100%30);

//        int numberOfClasses = 11;
//        numberOfClasses += 1;  // ++ --
//        System.out.println(numberOfClasses);

//        System.out.println("that is");
//        System.out.println("a computer");

        //System.out.println("that is \n \ba \'computer  \\");

        //System.out.println(Math.log(100));
        //System.out.println(Math.min(200,355));
//        System.out.println(Math.max(200,355));
//        System.out.println(Math.log(10));
//        System.out.println(Math.log(10));
//
//        Scanner userT = new Scanner(System.in);
        //userT.tokens();

        //System.out.println(5+5+"Class");
        //System.out.println("my"+"Class");
//        System.out.println("my".concat("class"));
//        System.out.println("myClass".length());
//        System.out.println("myClass".charAt(2));

        System.out.println(5==5);

        int n = 101517;
        int [] nArray={10,15,17,18,12};
        System.out.println(nArray.toString());
        String [] sArray={"a","b","Kabul","Afghanistan"};
        char [] cArray={'c','d','e'};
        System.out.println(sArray);

        }

}
