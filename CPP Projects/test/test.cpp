#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    long double b,d, a,c;
    cin >> a >> b >> c >> d;
        cout << (log(pow(a,b)) > log(pow(c,d))? ((log(pow(a,b))) == log(pow(c,d))? "NO":"YES"):"NO");
    return 0;
}
