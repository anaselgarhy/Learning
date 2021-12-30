#include <iostream>
using namespace std;

int main()
{
    float width, height;
    cout << "Calculate the area and perimeter of a rectangle program" << endl;
    cout << "Enter width: ";
    cin >> width;
    cout << "Enter height: ";
    cin >> height;

    float area = height * width;
    float perimeter = 2 * (height + width);

    cout << "Area of rectangle = " << area << endl << "Perimeter of rectangle = " << perimeter;


    return 0;
}
