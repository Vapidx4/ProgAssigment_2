import java.util.Scanner;

/**
 * Tells us how many days are in a select month... if its february... it'll also determine whether it is a leap year or not.
 * The user inputs the year and month
 * @author Brandon Lee Felix
 * @since 24/10/21
 */

public class CalcDays {



    static int calcDays1(int month, int year) {

        int days = 0;

        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            days = 31;}
        else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            days = 30;}
        else if ((month == 2) && (isLeapYear(year))){
            days = 29;}
        else{
            days = 28;}

        return days;

    }

    static int calcDays2(int month, int year){

        int i = 1;
        int days = 0;
        boolean isTwentyEight = true;

        switch (month){
            // 31 day cases
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            //30 day cases
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            // february
            case 2:
                days = 28;

                days = switch (isLeapYear2(year)) {
                    case 1 -> 29;
                    case 0 -> 28;
                    default -> days;
                };

        }
        return days;
    }

    static boolean isLeapYear(int year){
        boolean leapYear = true;
        // a leap year is evenly divisible by 4, but not evenly divisible by 100
        // century years need to be divided by 400 to see if its a leap year or not... if it is divisible, then it's true
        leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return leapYear;

    }

    static int isLeapYear2(int year){
        int value = 0;
        boolean leapYear = true;
        // a leap year is evenly divisible by 4, but not evenly divisible by 100
        // century years need to be divided by 400 to see if its a leap year or not... if it is divisible, then it's true
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            value = 1;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert month: ");
        int x = scan.nextInt();
        System.out.println("Insert year: ");
        int y = scan.nextInt();

        int answer = calcDays2(x, y);

        System.out.println("-------");
        System.out.println(answer + " days");
    }
}


