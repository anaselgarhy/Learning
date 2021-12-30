#include <iostream>
using namespace std;

int main()
{
    string name;
    int age;
    double gpa;

    cout << "Enter your name: ";
    cin >> name;
    cout << "Enter your age: ";
    cin >> age;
    cout << "Enter your GPA: ";
    cin >> gpa;
    //
    cout << "-------------------" << endl;
    cout << "Welcome " << name << ".\n"
         << "Your age is: " << age << endl
         << "And your GPA is: " << gpa << endl;
}
