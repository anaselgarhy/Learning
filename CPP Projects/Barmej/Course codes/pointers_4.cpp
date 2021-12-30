#include <iostream>
using namespace std;

int main(void)
{
    double x = 3.15, *ptr = &x;
    cout << &*ptr << endl;
    cout << *&ptr << endl;
    cout <<  *&x;
    return 0;
}
