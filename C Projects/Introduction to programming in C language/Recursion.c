#include <stdio.h>
#include <conio.h>
#include <ctype.h>

void main(void){


    int num=0, n=14;
    char ch;
    do{
    printf("Enter number: ");
    do{
        ch = getch();
        if(ch==48||ch==49||ch==50||ch==51||ch==52||ch==53||ch==54||ch==55||ch==56||ch==57){
            num = num *10 + ch -'0';
            putch(ch);
            n++;
        }
        else if(ch == 13)
        {
            clear(n);
            printf("Fact %d is %d", num, fact(num));
            getch();
            clear((n-14)+9+10);
            num = 0;
            n=14;
            break;
        }
        else if(ch ==27){
            break;
        } else if(ch == 8){
            if(n >= 14){
                --n;
                num/=10;
                clear(1);
            }
            }
    } while(1);
    }while(ch != 27);



}
void clear(int n){

    for(int i=n; i>0; i--){
        putch(8); // Backspace in ASCII
        putch(32); // Space in ASCII
        putch(8); // Backspace in ASCII
    }
}
int fact(int n){


    if(n == 0)
        return 1;
    else
        return (n * fact(n-1));



}
