#include <iostream>
#include <fstream>
int main(void)
{
    std::fstream fout = std::fstream("MyFile2.txt", std::ios::app);
    fout << "Hi I'm Anas n_n" << std::endl;
    fout.close();
    return 0;
}
