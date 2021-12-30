#include <iostream>
using namespace std;

void loop(int num)
{
    if(num == 0)
        return;
    cout << "loop:" << num-- << "\n";
    loop(num);
}

int main(void)
{
    loop(5);
    return 0;
}
