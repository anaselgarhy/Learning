#include <iostream>
#include <iomanip>
using namespace std;

/*
* Name      age    height
* ------------------------
* Ahmed     20     1.77
* Ali       32     1.76
* Mariam    22     1.56
* Ibrahim   33     1.82
* Sara      25     1.63
*/

int main(void)
{
    const int size = 5;
    string names[size] = {"Ahmed", "Ali", "Mariam", "Ibrahim", "Sara"};
    int ages[size] = {20, 32, 22, 33, 25};
    double heights[size] = {1.77, 1.76, 1.56, 1.82, 1.63};

    // Print head of table
    cout << "Name" << setw(9) << "age" << setw(9) << "height" << endl;
    cout << setfill('-') << setw(23) << ""<< endl;

    // print values
    cout << setfill(' ');
    for(int i=0; i<size; i++)
        cout <<setw(7) << names[i] << setw(7) << ages[i] << setw(9) << heights[i] << endl;

    return 0;
}
