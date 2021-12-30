
#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int n1, n2;
    printf("من فضلك ادخل الرقم الاول.....\n");
    scanf("%d", &n1);
    printf("من فضلك ادخل الرقم الثاني......\n");
    scanf("%d", &n2);
    int add = n1 + n2;
    int sub = n1 - n2;
    int mul = n1 * n2;
    int div = n1 / n2;
    printf("ناتج الجمع هوا %d\nناتج الطرح هوا  %d\nناتج الضرب هوا %d\nناتج القسمة هوا %d\n", add, sub, mul, div);
    

    return 0;
}

