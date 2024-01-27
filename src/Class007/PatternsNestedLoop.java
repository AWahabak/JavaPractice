package Class007;

public class PatternsNestedLoop {

    public static void main(String[] args) {

        /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
         */

        int r=7;
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"-");
            }
            System.out.println();
        }

        /*
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
         */

        for(int i=1;i<=r;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j+"-");
            }
            System.out.println();
        }

        /*
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
         */

    }
}
