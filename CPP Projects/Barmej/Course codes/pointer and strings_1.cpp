#include <iostream>
int main(void)
{
    char name[51];
    std::cout << "Please Enter yuor name: ";
    std::cin >> name;
    // Print
    char *ptr = name;
    for(; *ptr != '\0'; ptr++)
        std::cout << *ptr << ' ';
    return 0;
}
