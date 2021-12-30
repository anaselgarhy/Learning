#include "User.h"
#include "functions.h"
int size = 0;
User users[100];
int main()
{
    short input;
    while(true){
        cout << "[1]new user \t\t [2]LogIn \t\t [3] See all users" << endl;
        cout << "> ";
        cin >> input;
        switch(input){
        case 1:
            newUser(size, users);
            size++;
            break;
        case 2:
            logIn(size, users);
            break;


        }
    }


    return 0;
}
