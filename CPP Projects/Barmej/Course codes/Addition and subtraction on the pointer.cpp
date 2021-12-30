#include <iostream>
using namespace std;

int main(void)
{
    int array[] = {10, 20, 30, 40, 50};
    int *ptr = array; // int *ptr = &array[0];
    cout << *ptr << endl;
    ptr++; // Address in index 0 in array plus 1
    cout << *ptr << endl;
    cout << ++(*ptr) << endl;
    int x = *ptr++;
    cout << x << endl;
    cout << *ptr << endl;
    return 0;
}
