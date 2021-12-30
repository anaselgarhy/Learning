#include <iostream>
using namespace std;

int main(void)
{
    int g1 = 7;
    int g2 = 9;
    int g3 = 6;
    int g4 = 5;
    int g5 = 8;

    int *grades[5] = {&g1, &g2, &g3, &g4, &g5};

    // Multiple all grades in 10
    for(int i=0; i<5; i++)
        *grades[i] *= 10;

    cout << g1 << endl;
    cout << g2 << endl;
    cout << g3 << endl;
    cout << g4 << endl;
    cout << g5 << endl;

    return 0;
}
