#include <iostream>
using namespace std;

#define ONE 1
#define TOW ONE + ONE
#define FOUR TOW * TOW // = 3

const int UN = 1;
const int DEUX = UN + UN;
const int QUATRE = DEUX + DEUX; // = 4

int main(void)
{
    cout << "Preprocessor result = " << FOUR << endl;
    cout << "C++ constants result = " << QUATRE << endl;
    return 0;
}
