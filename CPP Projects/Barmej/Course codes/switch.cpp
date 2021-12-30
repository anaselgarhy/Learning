#include <iostream>
using namespace std;

int main()
{
    short int choose;

    cout << "Choose the language:\n"
         << "[1] Arabic\n"
         << "[2] English\n"
         << "[3] French\n"
         << "[4] Spanish\n" << endl;

         cout << "> ";
         cin >> choose;

         switch(choose){
        case 1:
            cout << "أهلا وسهلا" << endl;
            break;
        case 2:
            cout << "Hello There" << endl;
            break;
        case 3:
            cout << "Bonjour!" << endl;
            break;
        case 4:
            cout << "Hola!" << endl;
            break;
        default:
            cout << "Warning choose!" << endl;
         }

    return 0;
}
