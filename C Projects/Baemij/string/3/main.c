#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
    char *str =".com";
    char dest[11]="barmej";
    strcat(dest, str);
    printf("%s", dest);
    return 0;
}
