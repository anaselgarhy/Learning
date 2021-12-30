#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <ctype.h>
#include <string.h>
int convert_int(char byte){
    int num = 0;
    const char* charwith0;
    charwith0 = byte;
    sscanf(&charwith0, "%d", &num);
    return num;
}

int main(int argc, char *argv[]){
    char input[64];
    char readInputs;
    char scrtq[]= "scrt";
    int tempInt=1, tempIntArray[64], numLoobForNum =0, numLoobForAll=0;
    char tempChar; char tempString[64];
    printf(" > "); scanf("%s",&input);
    int numOfDigitInput = strlen(input);
    char numbersStart[numOfDigitInput];
    int numbersEnd[numOfDigitInput];
    for(int i=0; i <= numOfDigitInput; i++){

        readInputs = input[i];
        if(!(isalpha(readInputs))){
            //
            numLoobForNum++;
            if(numLoobForNum == 2 || numLoobForNum == 3 || numLoobForNum == 4){
                for(int n=0; n <= numLoobForNum; n++){
                    tempString[n] = numbersStart[n];
                    tempIntArray[n] = convert_int(tempString[n]);
                    numbersEnd[(i + n)-1] = tempIntArray[n];
                }



            }

        } else if(isalpha(readInputs)){
            //
            printf("char\n");
        }
        numLoobForAll++;
    }
    printf("%c\n\n",numbersStart[0]);
    printf("%d\n\n", tempIntArray[0]);
    printf("num %d        %d", numbersEnd[0], numbersEnd[1]);
        //printf("%c",input[0]);
        /*int x ;
        sscanf(input, "%d", &x);
        printf("%d",x);*/
    return 0;
}
