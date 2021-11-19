import java.util.Scanner;
/**
 * Calculates the future salary
 * The user inputs their current salary and the amount of years.
 * This helps to determine how much their salary will grow, depending on the years worked.
 * The amount of years worked also determines the rate
 * @author Brandon Lee Felix
 * @since 24/10/21
 */
public class CalcFutureSalary {

    static double calcFutureSalary(double currentSalary, int years) {

        double salary = 0;

        if (years < 3) { //if years < 3, the rate is 0.03, and raises the salary by 3% for every year worked
            double rate = 0.03;
            double math = 0.03 * years;
            double math2 = (math * currentSalary) + currentSalary;
        salary = math2;}

        else if ((years > 3) && (years < 10)){ //if years > 3 & < 10, the rate is 0.05, and raises the salary by 5% for every year worked
            double rate = 0.05;
            double math = 0.05 * years;
            double math2 = (math * currentSalary) + currentSalary;
            salary = math2;}

        else if (years >= 10){ //if years >= 10, the rate is 0.08, and raises the salary by 8% for every year worked
            double rate = 0.08;
            double math = 0.08 * years;
            double math2 = (math * currentSalary) + currentSalary;
            salary = math2;}
        return salary;
        }





    public static void main(String[] args) {
        //returns the future salary
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert current salary: ");
        int x = scan.nextInt();
        System.out.println("Insert amount of years: ");
        int y = scan.nextInt();

        double salary = calcFutureSalary(x,y);
        System.out.println("Your future salary is: " + "$" + salary);

    }
}
