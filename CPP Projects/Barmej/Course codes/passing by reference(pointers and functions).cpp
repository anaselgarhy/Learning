#include <iostream>
using namespace std;

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void increment2(int *x, int *y)
{
    (*x)++;
    (*y)++;
}
int main(void)
{
    int x = 10, y = 20;

    // Print default values
    cout << "Default values ..." << endl;
    cout << "X = " << x << endl;
    cout << "Y = " << y << endl;
    // Call increment2 function
    increment2(&x, &y);
    // Print values
    cout << "Value Before increment ..." << endl;
    cout << "X = " << x << endl;
    cout << "Y = " << y << endl;
    // Call swap function
    swap(&x, &y);
    // Print values
    cout << "Value Before swap ..." << endl;
    cout << "X = " << x << endl;
    cout << "Y = " << y << endl;
    return 0;
}
