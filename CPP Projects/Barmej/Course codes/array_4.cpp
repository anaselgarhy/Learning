#include <iostream>
using namespace std;
int main() {
 const int size = 5;
 int array[size] = {90, 93, 89, 85, 88};
 int sum = 0;

    // print
    for(int i=0; i<size; i++)
        cout << i << "- " << array[i] << endl;

    // sum
    for(int i=0; i<size; i++)
        sum += array[i];
    // print sum
    cout << "Sum = " << sum << endl;

    // print avrage
    cout << "Average = " << static_cast<double>(sum) / size;

 return 0;
}
