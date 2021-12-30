#include <iostream>
using namespace std;

int main(void)
{
    int x = 2;
    int &b = x;
    b = 10;
    cout << x << endl;
    cout << b << endl;
}
