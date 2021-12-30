#include <iostream>
using namespace std;
int main(void)
{
    const int size = 60;
    const int rangeSize = 21;
     int array[] = {10, 11, 9, 10, 11, 18, 10, 12, 11, 9, 20, 20, 9,9,9, 8, 7, 6,
                    5, 10, 11, 5, 20, 15, 13, 14, 16, 20, 19, 20, 10, 11, 13, 14, 15, 5, 5, 5, 10,
                    20, 3, 10, 10, 20, 11, 2, 11, 20, 0, 6, 4, 5, 11, 14, 15, 16, 16, 17, 12, 11};
    int numOfRepet[rangeSize] = {};

    //
    for(int i=0; i<size; i++)
        numOfRepet[array[i]]++;

    // Print
    for(int i=0; i<rangeSize; i++)
        cout << i << ": " << numOfRepet[i] << endl;
    return 0;
}
