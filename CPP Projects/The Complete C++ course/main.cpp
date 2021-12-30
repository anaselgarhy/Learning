#include <iostream>

using namespace std;

int main() {
    signed int x = -2147483648;
    unsigned int y = 4294967295;
    std::cout << &y << std::endl;
    return 0;
}
