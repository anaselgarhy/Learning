#include <iostream>
using namespace std;
void loop()
{
    cout << "loop ";
    loop();
}
int main(void)
{
    loop();
    return 0;
}
