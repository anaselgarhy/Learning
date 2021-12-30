#include <iostream>
int main(void)
{
    const int size = 5;
    int array[size] = {19, 4, 98, 7, 85};
    int *ptr = array;

    for(int i=0; i<size; i++)
        std::cout << *ptr++ << " ";
}
