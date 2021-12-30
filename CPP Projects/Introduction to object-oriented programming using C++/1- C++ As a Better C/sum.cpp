#include <iostream>

int main(void) // Look here
{
    int num1, num2, sum;

    std::cout << "Enter the first number: ";
    std::cin >> num1;

    std::cout << "Enter the second number: ";
    std::cin >> num2;

    sum = num1 + num2;

    std::cout << "The sum of " << num1 << " and " << num2 << " equal " << sum << std::endl;
    return 0;
}
