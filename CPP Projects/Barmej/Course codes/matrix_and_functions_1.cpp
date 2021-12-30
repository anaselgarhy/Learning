#include <iostream>
using namespace std;

void printMatrix(int matrix[][3], int rows)
{
    for(int i=0; i<rows; i++)
    {
        for(int j=0; j<3; j++)
            cout << matrix[i][j] << '\t';
        cout << endl;
    }
}

int main(void)
{
    const int rows=2, columns=3;
    int matrix[rows][columns] = {{1, 2, 3}, {8,9,5}};

    printMatrix(matrix, rows);
    return 0;
}
