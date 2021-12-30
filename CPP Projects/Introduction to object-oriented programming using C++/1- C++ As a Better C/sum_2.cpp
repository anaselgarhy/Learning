#include <iostream>
using namespace std; // Look here
int main(void)
{
    int num1, num2, sum;

    cout << "Enter the first number: ";
    cin >> num1;

    cout << "Enter the second number: ";
    cin >> num2;

    sum = num1 + num2;

    cout << "The sum of " << num1 << " and " << num2 << " equal " << sum << endl;
    return 0;
}
