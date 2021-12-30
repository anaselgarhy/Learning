#include <iostream>
using namespace std;

int main(void)
{
    const int rows = 2;
    const int columns = 3;
    int matrix[rows][columns] = {{1, 2, 3}, {8,9,5}};

    // print matrix
    // print rows
    for(int i=0; i<rows; i++)
    {
        // print columns
        for(int j=0; j<columns; j++)
            cout << matrix[i][j] << "\t";
        cout << endl;
    }
    return 0;
}
