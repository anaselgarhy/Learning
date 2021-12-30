#include <iostream>
using namespace std;

int x = 10; // Global variable

int main(void)
{
    int x = 30; // Local variable

    cout << "Local variable = " << x << endl; // Print 30
    cout << "Global variable = " << ::x << endl; // Print 10

    return 0;
}
