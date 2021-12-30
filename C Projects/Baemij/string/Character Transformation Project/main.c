#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char smallToCapital(char c)
{
    char cap=c;
    if(cap >90)
    {
        cap-=32;
    }
    return cap;
}
int main(int argc, char *argv[]) {
    char str[200];
    printf("Please enter text\n");
    scanf("%s", &str);
    int len=strlen(str);
    for(int i=0; i<len; i++)
    {
        str[i] = smallToCapital(str[i]);
    }
    printf("%s\n", str);

    return 0;
}
