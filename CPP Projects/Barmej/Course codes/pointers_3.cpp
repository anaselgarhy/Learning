#include <iostream>
using namespace std;

int main(void)
{
    int x = 20, y = 40;
    int *ptr = &x;

    cout << "X = " << x << endl;
    cout << "Y = " << y << endl;
    *ptr = 100;
    ptr = &y;
    *ptr = 200;
    cout << "X = " << x << endl;
    cout << "Y = " << y << endl;

    ptr = &x;
    cout << "ptr = " << ptr << endl;
    ptr = 0;
    cout << "ptr = " << ptr << endl;
    ptr = &x;
    cout << "ptr = " << ptr << endl;
    ptr = NULL;
    cout << "ptr = " << ptr << endl;
    return 0;
}
