#include <iostream>
#include <string>
using namespace std;
int main(void)
{
    string name;

    cout << "Enter your name: ";
    cin >> name;

    cout << "Hello, " << name <<endl;
    cout << "Your name length = " << name.length() << endl; // Look here
    return 0;
}
