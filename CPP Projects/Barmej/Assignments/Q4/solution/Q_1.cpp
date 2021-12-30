#include <iostream>
using namespace std;

int main()
{
    int x1 = 3;
    int x2 = 5;
    int x3 = 1;

    int max = x1;

    if(x2 > max)
        max =x2;
    if(x3 > max)
        max = x3;

    cout << "Max value: " << max << "\n";
    return 0;
}
