package Class004;

public class SwitchStatements2 {

    public static void main(String[] args) {


//
//
//        switch(nameOfDay){
//            case "Sun":
//                System.out.println("We are off today");  //print operation
//                break;
//            case "Mon":
//                System.out.println("we have java lesson");
//                break;
//            case "Tue":
//                System.out.println("We do not have Java lesson");
//                break;
//            default:
//                System.out.println("No plans for today");
//                break;
//        }

//        String nameOfDay="Sun";
//
//        if(nameOfDay=="Sun"){  // true or false
//            System.out.println("We are off today");  //print operation
//        } else if (nameOfDay=="Mon") {
//            System.out.println("we have java lesson");
//        } else if (nameOfDay=="Tue"){
//            System.out.println("We do not have Java lesson");
//        } else {
//            System.out.println("No plans for today");
//        }

        String nameOfDay = "Wed";

        if (nameOfDay != "Sun") {  // true or false
            System.out.println("We are off today");  //print operation
        } else if (nameOfDay == "Mon" || nameOfDay == "Wed") {
            System.out.println("we have java lesson");
        } else if (nameOfDay == "Tue") {
            System.out.println("We do not have Java lesson");
        } else {
            System.out.println("No plans for today");
        }


        switch (nameOfDay) {
            case "Sun":
                System.out.println("We are off today");
                break;
            case "Mon":
                System.out.println("we have java lesson");
                break;
            case "Tue":
                System.out.println("We do not have Java lesson");
                break;
            default:
                System.out.println("No plans for today");
                break;
        }
    }
}
