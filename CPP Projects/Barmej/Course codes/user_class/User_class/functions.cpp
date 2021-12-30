#include "functions.h"
string name, pass;
short age;
short gender;
void newUser(int size, User users[]){
    cout << "Enter user name: ";
    cin >> name;
    cout << "Enter password: ";
    cin >> pass;
    cout << "Enter age: ";
    cin >>  age;
    cout << "[1]Male\t\t[2]Female" << endl << "> ";
    cin >> gender;
    users[size].setUserName(name);
    users[size].setPassword(pass);
    users[size].setAge(age);
    users[size].setGender((gender == 1)? Male: Female);
    fstream fout = fstream("Users.txt", ios::app);
    fout << users[size].getUserName() << ','
         << users[size].getPassword() << ','
         << users[size].getAge() << ','
         << users[size].getGender() << endl;
    fout.close();
}
void logIn(int size, User users[]){
    cout << "User name: ";
    cin >> name;
    cout << "Password: ";
    cin >> pass;
    for(int i=0; i<size; i++)
        if(users[i].getUserName() == name && users[i].getPassword() == pass)
        {
        cout << "Welcome " << users[i].getUserName() << endl;
        return;
        }
    cout << "invalid user name or password !" << endl;
}









