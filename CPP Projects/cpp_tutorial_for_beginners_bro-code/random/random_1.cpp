#include <iostream>
#include <stdlib.h> // srand, rand
#include <time.h> // time

int main() {
	// Pesudo-random number generator
	
	// Seed the random number generator
	srand(time(NULL));

	// Generate a random number between 0 and 9 
	int randomNumber = rand() % 10;

	// Print the random number
	std::cout << "Random number: " << randomNumber << std::endl;
}
