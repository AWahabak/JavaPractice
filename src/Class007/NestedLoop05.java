package Class007;

public class NestedLoop05 {
    public static void main(String[] args) {

/*
12345
23456
34567
45678
*/

        for(int j=0;j<4;j++){
            for(int i=1;i<=5;i++){
                System.out.print(i+j+"");
            }
            System.out.println();
        }


    }
}
