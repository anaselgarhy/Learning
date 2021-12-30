#include <iostream>
using namespace std;
int main(void)
{
    int *ptr1, *ptr2, *ptr3;

    ptr1 = new int(5); // initial value = 5

    ptr2 = new (int)(6); // initial value =6

    if((ptr3 = new int[30]) == NULL)
        cout << "Sorry can't  allocate array" << endl;

    // Display first tow integer values
    cout << "Integer 1: " << *ptr1 << endl;
    cout << "Integer 2: " << *ptr2 << endl;

    // Free space
    delete ptr1;
    delete ptr2;
    delete[] ptr3; // Look here
    return 0;
}
