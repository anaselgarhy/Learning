#include <iostream>
using namespace std;

int main(void)
{
    int x = 10, y = 7, *xPtr = &x;
    int **ptr = &xPtr;
    int ***ptr2;

    cout << &xPtr << endl;
    cout << &&&ptr << endl;
    cout << y***ptr << endl;
    return 0;
}
