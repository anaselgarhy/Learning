#include <iostream>
using namespace std;

int main(void)
{
    char ch[] = {'a', 'n', 'a', 's'};
    int ages[] = {18, 20, 65, 87, 22, 5};

    cout << sizeof(ch) << endl;
    cout << sizeof(ch)/sizeof(char) << endl; // sizeof(ch) / 1;
    cout << "--------------------" << endl;
    cout << sizeof(ages) / sizeof(int) << endl; // sizeof(ages) / 4;
    return 0;
}
