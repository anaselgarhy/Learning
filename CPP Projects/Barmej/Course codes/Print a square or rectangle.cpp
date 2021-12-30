#include <iostream>
using namespace std;

int main(void)
{
    char simbl;
    int w, h;

    cout << "Enter the height: ";
    cin >> h;
    cout << "Enter the width: ";
    cin >> w;
    cout << "Enter the symbol that you want to print the rectangle with: ";
    cin >> simbl;

    for(int i=0; i<h; i++){
        for(int j=0; j<w; j++)
            cout << simbl << " ";
        cout << endl;
    }
    return 0;
}
