#include <iostream>
using namespace std;

int power(int num, int pow)
{
    if(pow <= 0) // Base case
        return 1;
    return(num * power(num, pow-1));
}
int main(void)
{
    cout << power(8, 4);
    return 0;
}
