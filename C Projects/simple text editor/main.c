#include <stdio.h>
#include <stdlib.h>
#include <curses.h>
#include <conio.h>

int main(int argc, char **argv){
    long int i=0;
    char ch;
    char temp_ch, temp_s[30];
    unsigned long int char_countr, temp_char_countr;
    if(argc == 1){
            char_countr=0;
            temp_char_countr=0;
        FILE *fp = fopen("new_text.txt", "w");
        do {
            i++;
            printf("%-4d| ", i);
            che:
            ch = getch();
            //
            if(ch ==-32){
                ch =getch();
                switch(ch){
                    case 72:
                        // Up
                    break;
                    case 80:
                        // Down
                    break;
                    case 75:
                        // Lift
                        putch(8);
                        fseek(fp, --temp_char_countr, SEEK_SET);
                        for(int i=0; i< char_countr-temp_char_countr; i++)
                        if((fscanf(fp, "%c", &temp_ch)) != '\n' && temp_ch != EOF)
                            temp_s[i] = temp_ch;
                        fseek(fp, temp_char_countr, SEEK_SET);
                        printf("      String temp = %s", temp_s);
                        goto che;
                    break;
                    case 77:
                        // Right
                    break;
                }
            }else if(ch =='\r') {
                putch('\n');
                fputc('\n', fp);
                char_countr++;
                temp_char_countr = char_countr;
                continue;
            }else if(ch == 27)
                break;
            else{
                if(temp_char_countr != char_countr)
                {



                        fseek(fp, temp_char_countr, SEEK_SET);
                        fputc(ch, fp);
                        putch(ch);
                        char_countr++;
                        fprintf(fp, "%c%s", ch, temp_s);
                        printf("%c%s", ch, temp_s);
                        goto che;

                }
                else{
                fputc(ch, fp);
                putch(ch);
                char_countr++;
                temp_char_countr = char_countr;
                goto che;
                }
            }





    }while(1);
        fclose(fp);
}
}
