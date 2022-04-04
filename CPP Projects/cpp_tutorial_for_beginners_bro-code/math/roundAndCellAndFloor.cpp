#include <iostream>
#include <cmath>

int main() {
	double frnction_number;

	std::cout << "Enter a fraction number: ";
	std::cin >> frnction_number;

	std::cout << "The round(just round to down if the fruction less then 0.5) of the fraction number is: " << std::round(frnction_number) << std::endl;

	std::cout << "The floor(roundm down) of the fraction number is: " << std::floor(frnction_number) << std::endl;

	std::cout << "The ceil(round up) of the fraction number is: " << std::ceil(frnction_number) << std::endl;

}
