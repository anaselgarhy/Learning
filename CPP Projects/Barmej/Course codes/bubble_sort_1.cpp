#include <iostream>
using namespace std;

void printArray(int array[], int size);
void swap(int &, int &);
void bubble_sort(int array[], int size);

int main(void)
{
    int array[] = {2, 4 , 10, 6, 5, 8, 7, 9, 1, 12,11};
    // Get size of array
   const int size = sizeof(array)/sizeof(int);

   // Print array before sort
   cout << "Array elements before sort" << endl;
    printArray(array, size);

    // Call Bubble sort function
    bubble_sort(array, size);

    // Print array elements after sort
    cout << "Array elements after sort" << endl;
    printArray(array, size);
    return 0;
}
void printArray(int array[], int size)
{
    for(int i=0; i<size; i++)
        cout << array[i] << " ";
    cout << endl;
}
void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}
// See here
void bubble_sort(int array[], int size)
{
    for(int i=0; i<size; i++)
        for(int j=0; j<size-1; j++)
            if(array[j] > array[j+1])
                swap(array[j], array[j+1]);
}
