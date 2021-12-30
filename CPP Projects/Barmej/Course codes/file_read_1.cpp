#include <iostream>
#include <fstream>
using namespace std;

int main(void)
{
    fstream fin = fstream("D:\\The works\\CPP Projects\\Barmej\\user_class\\User_class\\Users.txt", ios::in);
    string str;
    while(fin >> str)
        cout << str << " ";
    fin.close();
    return 0;
}
