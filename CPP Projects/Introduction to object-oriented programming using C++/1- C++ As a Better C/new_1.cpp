#include <iostream>
using namespace std;
int main(void)
{
    int *x;

    x = new int; // Look here
    *x = 5;
    cout << "Allocated integer: " << *x << endl;
    return 0;
}
