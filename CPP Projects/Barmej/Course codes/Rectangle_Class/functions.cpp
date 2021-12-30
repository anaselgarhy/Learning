#include <iostream>
#include <cstring>
#include <iomanip>
#include "functions.h"
#include "Rectangle.h"

using namespace std;


int convertToInt(char *ch, of t){
    int tempNum = 0;
    char *ptr = ch;
    if(t == all)
        for(; *ptr != '\0'; ptr++)
            tempNum = (tempNum * 10) + *ptr - '0';
    else
        tempNum += *ptr - '0';
    return tempNum;
}
bool pressEnter(char *input){
    return strlen(input) == 0;
}
void printOptionsMenu(int numOfRectangles, short numOfMenu){
    switch(numOfMenu){
        case 1:
            cout << "what do you want to do:" << endl
                 << "[1]Calculate the area of a rectangle" << endl
                 << "[2]Calculate the perimeter of a rectangle"  << endl
                 << "[3]Rectangle drawing" << endl;
            if(numOfRectangles != 1)
                cout << "[4]Sum the areas of all rectangles" << endl
                     << "[5]Sum the perimeters of all rectangles" << endl;
            break;
    }
    cout << "> ";
}
void printRectanglesMenu(int numOfRectangles, Rectangle rectangles[]){
    // Print header of table
    cout << setw(5) << 'N' << " | " << "Height | Width" << endl;
    for(int i=0; i<numOfRectangles; i++)
        cout << setw(5) << (i+1) << " | "
             << setw(6) << rectangles[i].getHeight() << " | "
             << setw(5) << rectangles[i].getWidth() << endl;
}
bool checkNumber(char *input, of t){
    char *ptr = input;
    if(t == all){
        for(; *ptr != '\0'; ptr++)
            if(*ptr > 57 || *ptr < 48)
                return false;
        return true;
    } else
        return (*ptr <= 57 && *ptr >= 48);
}
void printErrorInputNotNumberMassage(){
    cout << "The value entered must be a number!" << endl;
}
float calculate(calcType type, int numOfRectangles, char *input, Rectangle rectangles[]){
    if(numOfRectangles != 1){
        for(;;){
            cout << "Enter number of rectangle you want to calculate of "
                 << (type == area? "area" : "perimeter") << endl;
            printRectanglesMenu(numOfRectangles, rectangles);
            cout << "> ";
            cin >> input;
            // Verify that the entry is a number
            if(!checkNumber(input, oneChar)){
                printErrorInputNotNumberMassage();
                continue;
            } else
                break;
        }
    } else
        input[0] = 1;
    return ((type == area)?
                rectangles[(convertToInt(input, oneChar) - 1)].area()
                :
                rectangles[(convertToInt(input, oneChar) - 1)].perimeter());
}