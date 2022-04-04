#include <iostream>
#include <algorithm> // min function included in this library in std namespace

int main() {
	int first_number, second_number;

	std::cout << "Enter the first number: ";
	std::cin >> first_number;

	std::cout << "Enter the second number: ";
	std::cin >> second_number;

	std::cout << "The minimum of " << first_number << " and " << second_number << " is " << std::min(first_number, second_number) << std::endl;}
