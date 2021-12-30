#include <stdio.h>
#include <conio.h>
#include <windows.h>

void main(void){

    int number=0;
    char ch;
    int counter=0;

    printf("Please enter integer less than 5 digits: ");

    while((ch=getch())!= '\r'){
        switch(ch){
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            if(counter <5){
            putch(ch);
            Beep(750,300);
            //مهم جدا
            number = number *10+ch -'0';
            counter++;
            }
            else
                Beep(760,250);
            break;
        case 8://Backspace
            if(counter >= 0){
                putch('\b');
                putch(' ');
                putch('\b');
                counter--;
                number/=10;
            }
            break;
        default:
            printf("\a");

        }
    }
    Beep(800,450);
    printf("\nYou get integer value : %d", number);


}
