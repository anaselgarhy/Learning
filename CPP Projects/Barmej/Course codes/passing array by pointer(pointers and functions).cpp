#include <iostream>
using namespace std;

void printArray(int *array, int size)
{
    for(int i=0; i<size; i++)
        cout << array[i] << ' ' << endl;
}
int main(void)
{
    int array[5] = {1, 2, 3, 4, 5};
    printArray(array, 5);
    return 0;
}
