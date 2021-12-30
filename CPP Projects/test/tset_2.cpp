#include <iostream>
using namespace std;

int main(void)
{
    long long l1, r1, l2, r2;
    cin >> l1 >> r1 >> l2 >> r2;
    if(l2 > r1 || l1 >r2)
        cout << -1;
    else
        if(l2 < r1 && ((l2 > l1 || l2 < l1) && (r2 > r1 || r2 < r1)))
            cout << (l1 > l2? l1:l2) << " " << (r1 < r2? r1:r2);
        else
            cout << (l1 > l2? l1:l2) << " " << (r1 < r2? r1:r2);
    return 0;
}
