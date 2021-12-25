#include <iostream>
#include <cstdlib>
#include <ctime>
#include <iomanip>
using namespace std;

int main(void)
{
    srand(time(0));

    const int arraySize = 60;
    const int rangeSize = 6;

    int array[arraySize];
    int frequency[rangeSize] = {};

    // filling array with random numbers
    for(int i=0; i<arraySize; i++)
        array[i] = rand() % rangeSize;

    // Get frequency
    for(int i=0; i<arraySize; i++)
        frequency[array[i]]++;

    // Print result
    for(int i=0; i<rangeSize; i++)
        //cout << "Value: " << i << "\tFrequency: " << frequency[i] << endl;
        cout << "Value: " << i
             << "\tFrequency: " << setfill('*') << setw(frequency[i]) << ""
             << setfill(' ') << setw(2) << '(' << frequency[i] << ')' << endl;

    return 0;
}
