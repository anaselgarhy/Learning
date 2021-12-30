#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int main(void)
{
    int score = 0, highestScore=0, estimatedNumber, attemptsNumber=0, missedTimes=0;
    int randomNumber, startNumber, endNumber;
    //Main loop
    do{
        srand(time(0));
        startNumber = (rand() % 920)+1;
        endNumber = startNumber + rand() %(1000 - startNumber + 1);
        randomNumber = startNumber + rand() %(endNumber - startNumber);

        // لقد فكرت في رقم بين [startNumber ]  و [endNumber ]  هل تمتلك الذكاء الكافي لتخمينه في اقل عدد من المرات ؟
        cout << "I thought about a number between " << startNumber-1 << " and " << endNumber+1 << ". Do you have the intelligence to guess the few times?" << endl;
        cout << "Type -1 to exit" << endl;
        cout << endNumber << endl;
        // Child loop
        while(1)
        {
            // Read Estimated Number
            cout << "> ";
            cin >> estimatedNumber;
            if(estimatedNumber == -1) // Exit
                {
                    switch(rand()%3)
                    {
                    case 0:
                        cout << "I knew that I would never find someone to care about what I think )':\nGoodbye >_" << endl;
                        break;
                    case 1:
                        cout << "I wanted you to play with me just a little bit ＞﹏＜" << endl;
                        break;
                    case 2:
                        cout << "You no longer love me ~(>_<。)＼" << endl;
                    }

                    exit(1);
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
                highestScore = (score > highestScore) ? score:highestScore;

                // Print the results
                cout << "Yes indeed the number you thought about it " << estimatedNumber << endl
                     << "You have tried " << attemptsNumber << " times to find the correct number" << endl
                     << "The number of times you missed " << missedTimes << endl
                     << "Your score " << score << "\t\tHighest Score " << highestScore << endl;
                break;
            }
            else // False
            {
                attemptsNumber++;
                missedTimes++;
                if(attemptsNumber > 15)
                    score=0;
                cout << "The number I thought about is " << ((estimatedNumber < randomNumber) ? "greater":"less") << " than the number you entered." << endl;
                continue;
            }
        }

    } while(1);
    return 0;
}
// The code was written by me n_n
// Programming is very, very fun 🖤
