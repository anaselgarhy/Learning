#include <iostream>
#include <cmath>

int main () {
	double x, y;

	std::cout << "Enter the y: ";
	std::cin >> y;

	std::cout << "Enter the x: ";
	std::cin >> x;

	std::cout << "The y^x is: " << pow(y, x) << std::endl;
}
