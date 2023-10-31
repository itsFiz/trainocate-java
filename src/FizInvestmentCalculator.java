import java.util.Scanner;

public class FizInvestmentCalculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Welcome to Fiz Investment Calculator!");
        System.out.println("Please enter your investment amount: ");
        int invest = sc.nextInt();
        System.out.println("How many years would you like to invest?");
        int years = sc.nextInt();
        System.out.println("Please enter the yearly return rate:");
        double dividend = sc.nextDouble()/100;

        System.out.println("Investment Calculator Result: ");
        System.out.println("Year\t Investment Amount\t Return rate % \t Profit");

        int currentYear = 2023;

        for (int year = currentYear; year < currentYear+years; year++){
            double investmentAmount = calculate(invest, year - currentYear, dividend);
            double profit = investmentAmount - invest;
            System.out.println(year + "\t" + invest + "\t" + (dividend * 100) + "%\t" + profit);
            invest = (int) investmentAmount;

        }
    }
    public static int calculate( int invest, int years, double dividend){
        return (int) (invest*Math.pow(1 + dividend, years));

    }
}


