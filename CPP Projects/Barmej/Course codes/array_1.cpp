#include <iostream>

int main(void)
{
    const int size = 5;
    std::string names[size] = {"Omar", "Anas", "Abdullah", "Ahmed", "Khalid"};
    // Print Array Elements
    for(int i=0; i<size; i++)
        std::cout << names[i] << std::endl;
    return 0;
}
