#include <iostream>

int main() {
	std::string make = "Ford";
	std::string model = "Mustang";
	int year = 2022;
	char status = 'N';

	printf("Make: %s\n", make.c_str()); // c_str() returns a C-style string because printf() expects a C-style string
	printf("Model: %s\n", model.c_str());
	printf("Year: %d\n", year);
	printf("Status: %c\n", status);
}
