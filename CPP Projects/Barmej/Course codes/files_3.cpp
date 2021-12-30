#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main(void)
{
    int id;
    string name;
    double balance;
    ofstream fout("bankAccunts.txt");
    fout << setw(6) << "ID" << setw(10) << "Name" << setw(10) << "Balance" << endl;

    cout << "? ";
    while(cin >> id >> name >> balance){
        fout << setw(6) << id << setw(10) << name << setw(10) << balance << endl;
        cout << "? ";
    }

    fout.close();

    return 0;
}
