#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
        FILE *f = fopen("myFile.txt", "w");
        char *s="Welcom to Barmej.com ";
        fwrite(s , sizeof(char), strlen(s), f);
        fclose(f);
        FILE *r = fopen("myFile.txt", "r");
        fseek(r , 0, SEEK_END);
        unsigned int sz =ftell(r);
        fseek(r, 0, SEEK_SET);
        char *data = (char *)malloc(sz);
        fread(data, sizeof(char), sz, r);
        printf("%s", data);
        free(data);


        fclose(r);

    return 0;
}
