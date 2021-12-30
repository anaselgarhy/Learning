#include <iostream>
using namespace std;

class Person
{
private: // See here
    string name;
    short age;
    float hight;
public: // See here
    Person(string n, short a, float h)
    {
        name = n;
        age = a;
        hight = h;
    }
    void print()
    {
        cout << "Name: " << name << '\t' << "Age: " << age << "\t  " << "Hight: " << hight << endl;
    }
};
int main(void)
{
    Person person1("Anas", 18, 1.76);
    Person person2("Omar", 22, 1.80);
    // Print
    person1.print();
    person2.print();
    return 0;
}
