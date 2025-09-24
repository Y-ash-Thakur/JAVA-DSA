package codewithyash;
// Packing java program
// To deploy console or command line program first we have to package
// the code into jar file (JAVA Archive)
// An artifact is an assembly of your project assets that you put
// together to test, deploy, or distribute your software solution or its part

public class javaCode {
    public static void main(String[] args) {
        System.out.println("Start");
     printNumbers(4);
        System.out.println("Finish");
    }

    public static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i ++)
            System.out.println(i);
    }
}
