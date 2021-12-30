#include <iostream>
using namespace std;

#define min(a, b) ((a) < (b)? (a):(b))

inline int MIN(int a, int b)
{
    return(a < b? a:b);
}

int main(void)
{
    int x = 5;
    int y = 5;

    cout << "Preprocessor minimum using #define is " << min(x++, 7) << endl;
    cout << "C++ Code Minimum using inline function is " << MIN(y++, 7) << endl;
    return 0;
}
