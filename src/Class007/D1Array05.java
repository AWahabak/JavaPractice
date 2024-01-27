package Class007;

public class D1Array05 {
    public static void main(String[] args) {
/*
        Create an array
        store 10,50,60,45,100
        then print elements which are present on odd indexes
        expected out 50,45
                */

        int[]numbers={10,50,60,45,100};
//intnumbers[]={10,50,60,45,100};itistheoldway
        for(int i=0;i<numbers.length;i++){
            if(i%2!=0){
                System.out.println(numbers[i]+" and index is "+i);
            }
        }
        System.out.println();
        System.out.println("-----------------------------------(aa)---------------------------------");
//simplerway
        for(int j=1;j<numbers.length;j+=2){//ifstartis1theninthatcaseoddnumbers
            System.out.println(numbers[j]+" and index is "+j);
        }

    }
}
