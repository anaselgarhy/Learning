#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {

    float arabic, english, math, science, religion, sports, history;
    float averagr = 0;

    printf("ادخل 7 دراجات و افصلها بفاصلة..");
    scanf("%f, %f, %f, %f, %f, %f, %f" &arabic, &english, &math, &science, &religion, &sports, &history);

    averagr = (arabic + english + math + science + religion + sports + history) / 7;
    printf("المعدل%f.2", averagr);

    return 0;
}
