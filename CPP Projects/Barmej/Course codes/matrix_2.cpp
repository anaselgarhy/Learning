#include <iostream>
using namespace std;

int main(void)
{
    int matrix[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Print diameter
    for(int row=0; row < sizeof(matrix[0])/ sizeof(int); row++)
    {
        for(int col=0; col< sizeof(matrix[0]) / sizeof(int); col++)
            if(col >= row)
                cout << matrix[row][col] << '\t';
            else
                cout << '\t';
        cout << endl;
    }
    return 0;
}
