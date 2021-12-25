#include <iostream>
#include <iomanip>
using namespace std;

int main(void)
{
    int hour, minute, second;
    cout << "Enter Hour: ";
    cin >> hour;
    cout << "Enter minute: ";
    cin >> minute;
    cout << "Enter second: ";
    cin >> second;

    // print formated time
    cout << setfill('0') << setw(2) << hour << ':' << setw(2) << minute << ':' << setw(2) << second;
    return 0;
}
