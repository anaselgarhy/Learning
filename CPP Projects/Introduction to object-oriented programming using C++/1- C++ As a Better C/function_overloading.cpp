#include <iostream>
using namespace std;

void sum(int num1, int num2) // sum@int@int
{
    cout << num1 + num2 << endl;
}
void sum(float num1, float num2) // sum@float@float
{
    cout << num1 + num2 << endl;
}
void sum(double num1, double num2) // sum@double@double
{
    cout << num1 + num2 << endl;
}

int main()
{
    sum(2, 7);
    sum(93.7f, 22.998f);
    sum(2.88888888876666, 3.7687666);
    return 0;
}
