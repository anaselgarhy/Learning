#include <iostream>
using namespace std;
void printCounter();
int main(void)
{
    printCounter();
    printCounter();
    return 0;
}
void printCounter()
{
    static int counter =0;
    cout << ++counter << endl;
}
