import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String [] args){

        int Principal = (int)readNumber("Principal", 1000, 1_000_000);
        float annualInterest = (float)readNumber("Annual Interest rate", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30 );

        printMortgage(Principal, annualInterest, years);
        printPaymentSchedule(years, Principal, annualInterest);
    }

    private static void printMortgage(int Principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(Principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte years, int Principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month ++){
            double balance = calculateBalance(Principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.println(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "and" + max);
        }
        return value;
    }

    public static double calculateBalance(
            int Principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayments = (short)(years * MONTHS_IN_YEAR);
        double balance = Principal
                *(Math.pow(1 + monthlyInterest, numbersOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                /(Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(
            int Principal,
            float annualInterest,
            byte years){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        short numbersOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = Principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

                return mortgage;
    }
}
