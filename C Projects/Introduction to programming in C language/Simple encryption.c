#include <stdio.h>
#include <string.h>

int main(int argc, char *argv){

    int len;
    char text[]=" ";
    printf("Enter Text: ");
    scanf("%s", text);
    len = strlen(text);
    char encryptionText[len];

    for(int i=0; i<len; i++){
            encryptionText[i] = ~(text[i]);
    }
    printf("%s", encryptionText);

}
