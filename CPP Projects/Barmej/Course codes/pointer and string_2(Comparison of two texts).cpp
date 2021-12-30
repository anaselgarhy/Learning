#include <iostream>
int main(void)
{
    const short size = 101;
    char string1[size], string2[size];
    char *ptr1 = string1, *ptr2 = string2;
    // Read inputs from user
    for(short i=1; i<3; i++)
    {
        std::cout << "Please enter string " << i << " (less than or equal 100 charcatar:" << std::endl;
        std::cin.getline((i == 1)? string1 : string2, size, '\n');
    }
    // Comparison
    for(; *ptr1 != '\0' || *ptr2 != '\0'; ptr1++, ptr2++)
    {
        if(*ptr1 != *ptr2)
        {
            std::cout << "\ntwo different texts !" << std::endl;
            std::exit(0);
        }
    }
    std::cout << "\ntwo identical texts" << std::endl;
    return 0;
}
