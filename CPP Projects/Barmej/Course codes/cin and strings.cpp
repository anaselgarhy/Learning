#include <iostream>
int main(void)
{
    char name[21]; // The extra one of the null character
    char major[21];

    std::cout << "Please enter your name: ";
    std::cin.getline(name, 21, '\n');
    std::cout << "Please enter major: ";
    std::cin.getline(major, 21, '\n');

    std::cout << "Hello " << name << std::endl;
    std::cout << "Your Major is " << major << std::endl;
    return 0;
}

