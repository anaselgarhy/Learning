#include <iostream>
using namespace std;

int main()
{
    short int op;


    // print options
    cout << "[1] Sum" << endl
         << "[2] Subtraction" << endl
         << "[3] Multiply" << endl
         << "[4] Division" << endl
         << "[5] Remainder" << endl
         << "[6] Exit" << endl;

         // Choose an operation
         cout << "Choose an operation: ";
         cin >> op;

         if(op < 6){
            float num1, num2;

            cout << "Enter first number: ";
            cin >> num1;
            cout << "Enter second number: ";
            cin >> num2;
         //
         if(op == 1)
            cout << num1 << "+" << num2 << "=" << (num1+num2) << endl;
         else if(op == 2)
            cout << num1 << "-" << num2 << "=" << (num1-num2) << endl;
         else if(op == 3)
            cout << num1 << "*" << num2 << "=" << (num1*num2) << endl;
         else if(op == 4)
            if(num1 == 0 || num2 == 0)
                cout << "Cannot divide by zero!" << endl;
            else
                cout << num1 << "/" << num2 << "=" << (num1/num2) << endl;
         else if(op == 5)
            cout << num1 << "%" << num2 << "=" << ((int)num1%(int)num2) << endl;

         }
         else if(op == 6){
            cout << "Good bye ^_^" << endl;
            return 1;
         }
         else
            cout << "Wrong choice !";
    cout << "And bye n_n" << endl;
    return 0;
}
