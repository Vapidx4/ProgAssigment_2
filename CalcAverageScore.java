import java.util.Random;
import java.util.Scanner;

/**
 * Calculates the average score from set of random numbers... User inputs how many scores they want
 * If score is less than 40... it is not counted
 * @author Brandon Lee Felix
 * @since 24/10/21
 */

public class CalcAverageScore {

    // Create a checkAge() method with an integer variable called age

    static double calcAverageScore (double numb, double divisor) {
        return numb/divisor;
    }

    public static void main(String[] args) {
     //Creates scanner and random
       Scanner scan = new Scanner(System.in);
        System.out.println("How many scores do you want?: ");
        int x = scan.nextInt();
        System.out.println(x + " scores generated");
        Random random = new Random();
        int i = 0;
        int max = 100;
        double numb = 0;
        double divisor = 0;


        System.out.println("-------");
        System.out.println("Scores 40 or over:");


        while (i<x){ //While i is less than x, the loop continues

            double score = random.nextInt(max);  //Generates a random number for every time the loop is executed
            i++;

            if (score >= 40){ // if score is >= to 40, add score to numb, and increments divisor by 1
                numb = score + numb;
                divisor++;
                System.out.println(score);}
        }
        double average = calcAverageScore(numb, divisor);
        System.out.println("-------");

        System.out.println("Average: " + average);


    }


}

// Outputs "Access granted - You are old enough!"

