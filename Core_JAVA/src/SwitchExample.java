public class SwitchExample {
    public static void main (String [] args){
        String day = "SUNDAY";


        switch(day){
            case "Monday":
                System.out.println("it is monday");
                break;
            case "TUES":
                System.out.println("it is tuesday");
                break;
            case "WED":
                System.out.println("it is wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
