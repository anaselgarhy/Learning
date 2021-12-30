#include <iostream>
using namespace std;

int main()
{
    int num;
    while(1){
    cout << "Enter number: ";
    cin >> num;
    if(num == -1)
        break;
    for(int i=1; i <= 14; i++)
        cout << num << " * " << i << " = " << num*i << endl;
    }

    return 0;
}
