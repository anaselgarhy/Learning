#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
//#include "pch.h"
#pragma warning(disable : 4996).//هاد السطر بتحتاجو لمنع بعض التحذيرات مثل تحذير 4996
//متل مانك شايف هاد مش ايرور هاد بس وارنينج يعني تحذير


typedef enum {
    //
    t, f, o, d,
    //files operation
    write, read
}boolean;
void userInterface1();
void userInterfaceRandom2();
void userInterfaceRandom3();
int randomNumbers(char* fileName, boolean choice, int number, int limitNumber, char choiceIn);
void randomNumbersInput(boolean choice);
int randomWords(boolean choice);
int randomEmails(boolean choice);
FILE* fileOpen(boolean operation, char* fileName);

int main(int argc, char* argv[]) {

    char c;
    do {
        userInterface1();
        srand(time(0));
        scanf("%c", &c);
        switch (c) {
        case '1':
            userInterfaceRandom2();
            scanf("%s", &c);
            switch (c) {
            case '1':
                do {
                    userInterfaceRandom3();
                    scanf("%s", &c);
                    if (c == '1') {
                        //
                        randomNumbersInput(t);
                    }
                    else if (c == '2') {
                        //
                        randomWords(t);
                    }
                    else {
                        printf("Error choice.\n");
                    }
                } while (c != '0');
                c = '1';
                break;
            case '2':
                do {
                    userInterfaceRandom3();
                    scanf("%s", &c);
                    if (c == '1') {
                        randomNumbersInput(f);
                    }
                    else if (c == '2') {
                        randomWords(f);
                    }
                    else {
                        printf("Error choice.\n");
                    }
                } while (c != '0');
                c = '1';
                break;
            case '3':
                do {
                    userInterfaceRandom3();
                    scanf("%s", &c);
                    if (c == '1') {
                        randomNumbersInput(o);
                    }
                    else if (c == '2') {
                        randomWords(o);
                    }
                    else {
                        printf("Error choice.\n");
                    }
                } while (c != '0');
                c = '1';
                break;
            default:
                printf("Error choice.\n");
                break;
            }
            break;
            //2
        case '2':
            do {
                userInterfaceRandom2();
                scanf("%s", &c);
                switch (c) {
                case '1':

                    randomEmails(t);

                    c = '1';
                    break;
                case '2':
                    do {
                        randomEmails(f);
                    } while (c != '0');
                    c = '1';
                    break;
                case '3':
                    do {
                        randomEmails(o);
                    } while (c != '0');
                    c = '1';
                    break;
                case '0':
                    break;
                default:
                    printf("Error choice.\n");
                    break;
                }
            } while (c != '0');
            c = '1';
            break;
        case '3':
            do {
                userInterfaceRandom2();
                scanf("%s", c);
                if (c == '1') {
                    randomEmails(t);
                }
            } while (c != '0');
            c = '1';
            break;
        case '4':
            //
            /*   FILE *file= fopen("Random_Words.txt","r");
            int counter=0;
            char find = fgetc(file);
            while(find != '0')
            {
                if(file == EOF)
                {
                    exit(0);
                }
                counter++;
                // printf("We did not find 0");
            }
            printf("The number 0 is in Field No. %d", counter);*/
            break;
        case '0':
            printf("Goodbye ^_^");
            break;
        default:
            printf("Error choice.\n");
            break;
        }
    } while (c != '0');

    return 0;
}
//User Interfaces واجهاتالمستخدم
void userInterface1() {
    printf(" Choose the operation you want to perform :\n");
    printf(" 1-Generate a random letters and numbers\t2-Generate a random Email\n");
    printf(" 3-Generate a random passwords\t\t\t4-Find a number\n");

}
void userInterfaceRandom2() {
    printf("Choose the appropriate obstetric method for you : \n");
    printf("[1]In a file with a Random.txt name\t[2]In this program\t[3]Both together \n");
}
void userInterfaceRandom3() {
    //
    printf("[1]Generate random numbers\t[2]Generate random words \n");
}
//Open files
FILE* fileOpen(boolean operation, char* fileName) {
    //
    if (operation == write) {
        FILE* file = fopen(fileName, "w");
        return file;
    }
    else if (operation == read) {
        FILE* file = fopen(fileName, "r");
        return file;
    }
}
//Input Random numbers function
void randomNumbersInput(boolean choice) {
    int number; int limit; int limitNumber = 0;
    char choiceIn;
    char fileName[64];
    char DefaultName[] = "Random_Numbers.txt";

    if (choice == t || choice == o) {
        printf("Enter the name of the file in which you want to generate the numbers; Type 0 to save to default file:\n");
        scanf("%s", &fileName);
        if (fileName == "0") {
            //memcpy(&fileName, DefaultName,sizeof(DefaultName));
            //memcpy(&DefaultName, fileName,sizeof(fileName));
        }
    }
    printf("Enter the number of repeats: ");
    scanf("%d", &number);
    printf("Do you want to print a new line after each number? y/n: ");
    scanf("%s", &choiceIn);
    if (choiceIn == 'y' || choiceIn == '1') {
        printf("Enter the digits you want on one line: ");
        scanf("%d", &limitNumber);
    }
    randomNumbers(fileName, choice, number, limitNumber, choiceIn);

}
int randomNumbers(char* fileName, boolean choice, int number, int limitNumber, char choiceIn) {

    if (choice == t || choice == o) {
        // Random Numbers in a file


        FILE* file = fileOpen(write, fileName);
        for (int i = 0; i < number; i++) {
            int num = 0;
            for (int i = 0; i < limitNumber; i++) {
                int R = rand() % (9 + 1);
                if (choiceIn == 'y' || choiceIn == '1') {
                    num++;
                    if (num == limitNumber) {
                        fprintf(file, "%d\n", R);
                        if (choice == o) {
                            printf("%d\n", R);
                        }
                    }
                    else {
                        fprintf(file, "%d", R);
                        if (choice == o) {
                            printf("%d", R);
                        }
                    }
                }
                else {
                    fprintf(file, "%d", R);
                    if (choice == o) {
                        printf("%d", R);
                    }
                }
            }
        }
        fclose(file);
        file = fileOpen(read, fileName);
        fseek(file, 0, SEEK_END);
        unsigned int size = ftell(file);
        fclose(file);
        printf("%d random digits were generated in a Random_Numbers.txt file \n", size);

    }

    /*else if(choice == f){
        //Random Numbers in a programm
    for(int i=0;i<number;i++){
        int R =rand()% (limit+1);
        if(choiceIn == 'y'||choiceIn =='1'){
            printf("%d\n",R);
            }else{
            printf("%d",R);
            }

    }

    }else if(choice==o){
        //Random Numbers in a both together
        //FILE *file =fopen("Random_Numbers.txt","w");
        for(int i=0;i<number;i++){
            int R =rand()% (limit+1);
            if(choiceIn == 'y'||choiceIn =='1'){
                fprintf(file,"%d\n",R);
                printf("%d\n",R);
                }else{
                    fprintf(file,"%d",R);
                    printf("%d",R);
                }
            return R;
        }
        fclose(file);
        FILE *fileOpen =fopen("Random_Numbers.txt","r");
        fseek(fileOpen,0,SEEK_END);
        unsigned int size= ftell(fileOpen);
        fclose(fileOpen);
        printf("%d random digits were generated in a Random_Numbers.txt file \n",size);
    }
    printf("Done ^_^ \n");*/
    return 0;
}

int randomWords(boolean choice) {
    //
    int number; int Numberletters; int limit = 0;
    printf("Enter the number of repeats: ");
    scanf("%d", &number);
    printf("Enter the Number of letters: ");
    scanf("%d", &Numberletters);
    //A. B. C. D. E. F. G. H. I. J.// K. L. M. N. O. P. Q. R. S. T. U.V. W. X. Y. Z.
    char arrayChar[52] = { 'A','B','C','D','E','F','G','H','I','J',
                        'K','L','M','N','O','P','Q','R','S','T',
                        'U','V','W','X','Y','Z','a','b','c','d',
                        'e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','y','v','w','x',
                        'y','z' };
    if (choice == t) {
        //Random Words in a file
        FILE* file = fopen("Random_Words.txt", "w");
        for (int n = 0; n < number; n++) {
            for (int i = 0; i < Numberletters; i++) {
                int Random = rand() % 53;
                fprintf(file, "%c", arrayChar[Random]);
                limit++;
                if (limit == Numberletters) {
                    fprintf(file, "\n");
                    limit = 0;
                }
            }
        }
        fclose(file);
        FILE* fileOpen = fopen("Random_Words.txt", "r");
        fseek(fileOpen, 0, SEEK_END);
        unsigned int size = ftell(fileOpen);
        fclose(fileOpen);
        printf("%d random digits were generated in a Random_Words.txt file \n", size);
    }
    else if (choice == f) {
        //Random Words in a programm
        for (int n = 0; n < number; n++) {
            for (int i = 0; i < Numberletters; i++) {
                int Random = rand() % (53);
                printf("%c", arrayChar[Random]);
                limit++;
                if (limit == Numberletters) {
                    printf("\n");
                    limit = 0;
                }
            }
        }
    }
    else if (choice == o) {
        //Random Wordds in a both together
        FILE* file = fopen("Random_Words.txt", "w");
        for (int n = 0; n < number; n++) {
            for (int i = 0; i < Numberletters; i++) {
                int Random = rand() % 53;
                fprintf(file, "%c", arrayChar[Random]);
                printf("%c", arrayChar[Random]);
                limit++;
                if (limit == Numberletters) {
                    fprintf(file, "\n");
                    printf("\n");
                    limit = 0;
                }
            }
        }
        fclose(file);
        FILE* fileOpen = fopen("Random_Words.txt", "r");
        fseek(fileOpen, 0, SEEK_END);
        unsigned int size = ftell(fileOpen);
        fclose(fileOpen);
        printf("%d random digits were generated in a Random_Words.txt file \n", size);
    }
    printf("Done ^_^ \n");
    return 0;
}

//Emails
int randomEmails(boolean choice) {
    //
    char* domain; int number, limit;
    int onLimit = 1;
    char arrayChar[26] = { 'a','b','c','d','e','f','g','h','i','j',
                        'k','l','m','n','o','p','q','r','s','t',
                        'y','v','w','x','y','z' };
    const char* rootDomain[4] = { "com","net","edu","org" };
    printf("Enter the Domain: ");
    scanf("%s", &domain);
    printf("Enter the number of repeats: ");
    scanf("%d", &number);
    if (choice == t) {
        //
        limit = 7;
        FILE* file = fopen("Random_Emails.txt", "w");
        for (int i = 0; i < number; i++) {
            int random = rand() % 27;
            for (int no = 0; no < limit; no++) {
                fprintf(file, "%c", arrayChar[random]);
                onLimit++;
                if (onLimit == limit) {
                    fprintf(file, "%s.%s\n", &domain, rootDomain[0]);
                    onLimit = 1;
                }
            }
        }
        fclose(file);
    }
    else if (choice == f) {
        //
    }
    else if (choice == o) {
        //
    }
    return 0;
}
