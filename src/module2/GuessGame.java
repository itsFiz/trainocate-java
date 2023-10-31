
package module2;
import java.util.Scanner;
public class GuessGame {
    boolean isCorrect;
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        while(true){
            System.out.println("Guess a number from 1-100: ");
            int guess = sc.nextInt();
            if (guess == random){
                System.out.println("Congrats! "+ random + " is the correct number. You guessed "+ tries + " times");
            break;
            } else {
                if (guess> random){
                    System.out.println("Guess Lower");
                    tries++;
                }
                else if (guess < random){
                    System.out.println("Guess Higher");
                    tries++;
                }
            }
        }
    }

}
