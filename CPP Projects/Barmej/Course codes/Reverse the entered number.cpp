#include <iostream>
using namespace std;

int main()
{
    int num;

    cout << "Please enter number(From three digits): ";
    cin >> num;
    //check
    if(num >= 100 && num <= 999){
        int a1= num % 10;
        int a2 = (num / 10) % 10;
        int a3 = num / 100;
        cout << a1 << a2 << a3 << endl;
    }
    else
        cout << "This number does not have three digits !!" << endl;

    return 0;
}
