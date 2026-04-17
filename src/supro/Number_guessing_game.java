package supro;

import java.util.Scanner;

public class Number_guessing_game
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rand=(int) (Math.random()*100);
        int dis=0;
        int tryn=2;
        while(tryn<=3) {
            System.out.println("Guess the number ");
            int guess = in.nextInt();
            if (rand == guess) {
                System.out.println("You guessed the number ");
                break;

            } else if (rand > guess) {
                dis = rand-guess;
                System.out.println("it's too low");
                System.out.println("The distance between the numbers is: " + dis);
                System.out.println("Try again");
                tryn++;
            } else {
                dis = guess-rand;
                System.out.println("it's too high");
                System.out.println("The distance between the numbers is: " + dis);
                System.out.println("Try again");
                tryn++;
            }

        }
        System.out.println("The number is " + rand);

    }
}
