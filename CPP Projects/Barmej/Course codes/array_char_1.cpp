#include <iostream>
using namespace std;

int main(void)
{
    char str[] = "Hello World!";

    for(int i=0; str[i] != '\0'; i++)
        cout << str[i] << "-";
    return 0;
}
