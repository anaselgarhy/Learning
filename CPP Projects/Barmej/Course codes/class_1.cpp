#include <iostream>
using namespace std;

class Date // See here
{
public: // See here
    int year;
    int month;
    int day;

    // Constructor
    Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
        // print date
        print();
    }
    // fill function
    void fill(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    // Print function
    void print()
    {
        cout << month << '/' << day << '/' << year << endl;
    }
}; // See here
int main(void)
{
    Date birthDay(26, 03, 2003), birthDay2(20, 07, 2005); // See here
    return 0;
}
