package Class007;

public class D1Array03 {
    public static void main(String[] args) {

        String[] nameCity={"Kabul","Herat","Bamyan","Maza-e-Sharif","Nangarhar"};
        for(int j=0;j<nameCity.length;j++){
            System.out.print(nameCity[j]+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        int k=0;
        while(k<nameCity.length){
            System.out.print(nameCity[k]+" ");
            k++;
        }


    }
}
