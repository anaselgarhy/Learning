#include <iostream>
#include <cstdlib>
#include <ctime>

int main(void)
{
    srand(time(0));
    const int size = 5;
    int array[size];

    //Add rndom numbers les than 10 in array
    for(int i=0; i<size; i++)
        array[i] = rand() % 10;

    // Print Array elements
    for(int i=0; i<size; i++)
        std::cout << array[i] << std::endl;

    return 0;
}
