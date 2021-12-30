#include <iostream>
#include <fstream>
using namespace std;

int main(void)
{
    fstream fout("MyFile.txt", ios::out);
    fout << "انه حقا رائع" << endl;
    fout << "أنا انس وانا سعيد جدا" << endl;
    fout.close();
    return 0;
}
