#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    printf("اهلا بك في برنامجنا\n");
    printf("من فضلك ادخل عمرك\n");
    int age;
    scanf("%d", &age);
    printf("عمرك هو  %d\n", age);
    printf("من فضلك ادخل وزنك\n");
    float weiaht;
    scanf("%f", weiaht);
    printf("وزنك هوا %.2f \n", weiaht);
    
    return 0;
}

