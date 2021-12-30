#include <iostream>
using namespace std;

void myFunction(int = 7, int = 5);

int main(void)
{
    int parameter1 = 6;
    int parameter2 = 2;

    myFunction(); // Print parameter one = 7 and parameter two = 5
    myFunction(parameter1); // Print parameter one = 6 and parameter two = 5
    myFunction(parameter1, parameter2); // Print parameter one = 6 and parameter two = 2

    return 0;
}

void myFunction(int parameter1, int parameter2)
{
    cout << "Parameter one = " << parameter1 << " and parameter two = " << parameter2 << endl;
}
