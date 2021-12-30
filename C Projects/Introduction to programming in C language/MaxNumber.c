
// تم التأجيل

#include <stdio.h>
#include <limits.h>
#include <conio.h>
#include <string.h>

char merge(char *str1, char *str2);

char *concatString(char *s1,char *s2){
    char *s3 = NULL;
    s3 = (char *)malloc((strlen(s1)+strlen(s2))*sizeof(char));
    strcpy(s3,s1);
    strcat(s3,s2);
    return s3;
}

int convert_int(char byte){
    int num = 0;
    const char* charwith0;
    charwith0 = byte;
    sscanf(&charwith0, "%d", &num);
    return num;
}

void main(void){

    // ASCII Esc button = 27
    // ASCII Enter button = 13

    int numASCII[10] = {48, 49, 50, 51, 52, 53, 54,55,56,57};
    int numList[10] = {0, 1, 2, 3, 4, 5, 6, 7,8,9};
    int num, tempNumASCII = 0, max = INT_MIN;
    char *numTemp;
    char *nstr;
    int n=0;
    printf("Please enter number terminated exit button.\n");

    do{
        tempNumASCII = (int)getche();
        if(tempNumASCII != 27){
            if(tempNumASCII != 13){
                for(int i =0; i<10; i++){
                    if(tempNumASCII == numASCII[i]){
                        nstr = concatString(numTemp,numList[i]);
                        n++;
                        break;
                    }
                }
            }else{
                int bb;
                for(int i=0; i<n; i++){


                }
                n=0;
                max = (num > max)? num:max;
                    printf("\n%d", (int)numTemp[0]);
                }
        }
    } while(tempNumASCII != 27);
}

char merge(char *str1, char *str2){

    char *new_string;

    //أنشئ متغير جديد وخصص له ذاكرة تساوي مضروب حجم نوع المتغير في طول المتغيرين + واحد لل \0 بايت
    new_string = (char *) malloc(sizeof(char) * (strlen(str1) + strlen(str2)) +1);
    if(new_string == NULL)
        return(-1); //لم تعد هناك ذاكرة كافية في النظام, لذا لافائدة من الإستمرار
    //نقل البيانات للمتغير الجديد
    sprintf(new_string, "%s%s", str1, str2);

    //إرجاع القيمة
    return (new_string);




}
