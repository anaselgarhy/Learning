#include <iostream>
using namespace std;

int main(void)
{
    int x = 11;
    double y = 3.5555687;
    int *xPtr = &x;
    double *yPtr = &y;

    cout << "X value = " << x << endl;
    cout << "X address = " << xPtr << endl;

    cout << "Y value = " << y << endl;
    cout << "Y address = " << yPtr << endl;
    return 0;
}
