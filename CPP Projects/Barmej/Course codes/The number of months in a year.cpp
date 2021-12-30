#include <iostream>
using namespace std;

int main()
{
    const int days = 365;
    cout << days / 7 << " weeks"
         << " & " << days % 7 << "days" << endl;
    return 0;
}
