#include <iostream>
using namespace std;

int main(void)
{
    int i=0;
    float greade=0.0, sum=0.0;

    cout << "Insert degree after degree,If you want to end the program, type -1" << endl;
    while(1)
    {
        cout << "> ";
        cin >> greade;
        if(greade == -1.0)
            break;
        sum += greade;
        i++;
    }
    cout << "Number of students: " << i << endl
         << "Total score: " << sum << endl
         << "Arithmetic mean of scores: " << (sum / i) << endl;
    return 0;
}
