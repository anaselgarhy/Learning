package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 0, highestScore=0, estimatedNumber, attemptsNumber=0, missedTimes=0;
        int randomNumber, startNumber, endNumber;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //Main loop
        do{
            startNumber = rand.nextInt(920 - 1) + 1;
            endNumber = rand.nextInt(1000 - startNumber) + startNumber;
            randomNumber = rand.nextInt(endNumber - startNumber) + startNumber;

            // لقد فكرت في رقم بين [startNumber ]  و [endNumber ]  هل تمتلك الذكاء الكافي لتخمينه في اقل عدد من المرات ؟
            System.out.printf("I thought about a number between %d and %d. Do you have the intelligence to guess the few times?\n", startNumber-1, endNumber+1);
            System.out.println("Type -1 to exit");
            // Child loop
            while(true)
            {
                // Read Estimated Number
                System.out.print("> ");
                estimatedNumber = input.nextInt();
                if(estimatedNumber == -1) // Exit
                {
                    switch(rand.nextInt(3))
                    {
                        case 0 -> System.out.println("I knew that I would never find someone to care about what I think )':\nGoodbye >_");
                        case 1 -> System.out.println("I wanted you to play with me just a little bit ＞﹏＜");
                        case 2 -> System.out.println("You no longer love me ~(>_<。)＼");
                    }

                    System.exit(1);
                }
                // Check Estimated Number
                if(estimatedNumber == randomNumber) // True
                {
                    attemptsNumber++;
                    // Calc score
                    if(attemptsNumber <= 4)
                        score += 50;
                    else if(attemptsNumber <= 8)
                        score += 35;
                    else if(attemptsNumber <= 10)
                        score += 20;
                    else if(attemptsNumber <= 15)
                        score += 10;
                    else
                        score =5;
                    // Check highest score
                    highestScore = (score > highestScore) ? score:highestScore;

                    // Print the results
                    System.out.println("Yes indeed the number you thought about it " + estimatedNumber + "\n"
                                        + "You have tried " + attemptsNumber + " times to find the correct number" + "\n"
                                        + "The number of times you missed " + missedTimes + "\n"
                                        + "Your score " + score + "\t\tHighest Score " + highestScore + "\n"
                                        + "------------------------------------------------");
                    // Rest attempts number
                    attemptsNumber=0;
                    break;
                }
                else // False
                {
                    attemptsNumber++;
                    missedTimes++;
                    if(attemptsNumber > 15)
                        score=0;
                    System.out.printf("The number I thought about is %s than the number you entered.\n",
                            ((estimatedNumber < randomNumber) ? "greater":"less"));
                    continue;
                }
            }

        } while(true);
    }
}
// The code was written by me n_n
// Programming is very, very fun 🖤