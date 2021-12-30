#include <iostream>
#include <cstdlib>
#include <ctime>


int main(void)
{
    srand(time(0));
    int start = 90, endp = 120;
    for(int i=0; i<3; i++)
        std::cout << start + rand() %(endp - start +1) << std::endl;
    return 0;
}
