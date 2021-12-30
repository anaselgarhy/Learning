#include <iostream>
using namespace std;

void signUp(string email,string password, string name, string phone= "None", float salary= 1.5)
{
    cout << "User name" << name << endl
         << "Email: " << email << endl
         << "Password: " << password << endl
         << "Phone: " << phone << endl
         << "Salary: " << salary << endl;
}
int main(void){
    signUp("ahmed@gmail.com", "popa", "Ahmed", "877 765 877", 8000.50);
    signUp("amein@mail.org", "ht#e2", "Amen");
    return 0;
}
