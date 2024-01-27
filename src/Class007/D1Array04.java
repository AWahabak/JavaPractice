package Class007;

public class D1Array04 {
    public static void main(String[] args) {

/*
write a loop that starts from 0 and it goes till the number 5 and print only the even numbers
create an array of chars and you have to print all the chars on even indexes
*/

        char[]charSymbols={'a','b','c','d','e'};
        for(int i=0;i<charSymbols.length;i++){
            if(i%2==0){
                System.out.println(charSymbols[i]+" and index is "+i);
            }
        }
        System.out.println();

        //otherway
        for(int j=0;j<=5;j+=2){
            System.out.println(charSymbols[j]+" and index is "+j);
        }


    }
}
