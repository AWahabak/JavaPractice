package Class007;

public class NestedLoop04 {
    public static void main(String[] args) {

/*
246810
246810
246810
246810
246810
*/

        int counter=0;
        while(counter<5){
            for(int i=2;i<=10;i=i+2){
                System.out.print(i+"");
            }
            System.out.println();
            counter++;
        }



    }
}
