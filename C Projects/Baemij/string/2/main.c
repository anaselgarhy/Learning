#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
 char *s1, *s2;
 s1="barmej.com";
 s2="barmej.com";
 int x=strlen(s1);
 printf("%d\n", x);
int status = strcmp(s1, s2);
 if(status==0)
 {
     printf("Text length: %d", x);
 }
 else
 {
     printf("The two texts are not equal");
 }
    return 0;
}
