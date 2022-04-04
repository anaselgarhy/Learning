#include <iostream>
#include <algorithm>

int main() {
	double firstNum, secondNum;
	std::cout << "This program will get a max number between two numbers you enter.\n";
	std::cout << "Enter the first number: ";
	std::cin >> firstNum;
	std::cout << "Enter the second number: ";
	std::cin >> secondNum;

	std::cout << "The max number is: " << std::max(firstNum, secondNum) << std::endl;
}

