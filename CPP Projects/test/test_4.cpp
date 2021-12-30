#include <iostream>
using namespace std;
int recursion(int num);
int main(void)
{
    int num;
    cout << "Enter number: ";
    cin >> num;
    cout << recursion(num);
}
int recursion(int num)
{
    if(num == 1)
        return (num);
    else
        return (recursion(num - 1) + num);
}
