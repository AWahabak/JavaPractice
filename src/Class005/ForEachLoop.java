package Class005;

public class ForEachLoop {

    public static void main(String[] args) {

        String [] names={"Ahmad","Javed","Asad","Tamim","Jamshid"};

//        for (int j=0;j<names.length;j++){
//            System.out.println(names[j]);
//        }

        for(String n:names){
            System.out.println(n);
        }

    }
}
