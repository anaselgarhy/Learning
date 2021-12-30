#include <iostream>
using namespace std;

int factorial(int num)
{
    if(num == 1 || num == 0) //Base case
        return 1;
    return(num * factorial(num-1));
}
int main(void)
{
    cout << factorial(6);
    return 0;
}
