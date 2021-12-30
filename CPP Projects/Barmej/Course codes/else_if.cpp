#include <iostream>
using namespace std;

int main()
{
    int grade;

    cout << "Please enter grade: ";
    cin >> grade;

    if(grade >= 90)
        cout << "Perfect n_n" <<endl;
    else if(grade >= 80)
        cout << "very good h_h" << endl;
    else if(grade >= 70)
        cout << "Good !" << endl;
    else if(grade >= 60)
        cout << "Acceptable" << endl;
    else
        cout << "Failed an exam." << endl;
    return 0;
}
