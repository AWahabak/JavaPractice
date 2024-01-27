package Class008;

public class EnumSample {

    public enum Season {AUTUMN, SPRING, SUMMER, WINTER}

    public static void main(String[] args) {

        Season seasonName=Season.SPRING;

        switch (seasonName){
            case AUTUMN -> System.out.println("this is fall season");
            case SPRING -> System.out.println("this is begining of year");
            case SUMMER -> System.out.println("this mid year");
            case WINTER -> System.out.println("the end of year");
            default -> System.out.println("invalid season");
        }


    }

}
