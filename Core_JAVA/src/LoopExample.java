public class LoopExample {
    public static void main(String [] args){


        for (int i = 1; i <= 10; i = i+3) {
            System.out.println(i + "");
        }

        for (int i = 10; i>0; i--){
            System.out.println(i + " ");

        }

        int j = 100;
        while(j <= 110){  // Entry control loop
            System.out.println(j);
            j++;
        }

        do{  // Exit control loop
            System.out.println(j);
            j++;
        } while(j <=110);

        int number [] = {1,2,3,4,5,6};

    }
}
