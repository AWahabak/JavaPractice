package Class007;

public class D1Array02 {
    public static void main(String[] args) {

        //2147483647 max size of array

        String[] names=new String[5];
        names[0]="John";
        names[1]="Anna";
        names[2]="Michael";
        names[3]="Donald";
        names[4]="Omar";
        System.out.println(names.length);

        for (int i=0; i<names.length; i++) {
            System.out.print(names[i]+" ");
        }


    }
}
