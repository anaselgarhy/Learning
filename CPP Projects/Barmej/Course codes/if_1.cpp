#include <iostream>
using namespace std;

int main()
{
    const int password = 1234;
    int input;

    cout << "Enter the password: ";
    cin >> input;

    if(input == password)
        cout << "Password is correct n_n" << endl << "Hi!" << endl;
    else
        cout << "Password is not correct";

    return 0;
}
