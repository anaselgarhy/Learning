#include "Rectangle.h"
#include "functions.h"
int main() {
    char tempInput[6];
    int numOfRectangles;
    // Read number of rectangle from user
    for(;;){
        cout << "Enter the number of rectangles you want to create(default value 1 and maximum value 99999): ";
        cin.getline(tempInput, 6);
        // Verify that the entry is a number
        if(!checkNumber(tempInput, oneChar)){
            printErrorInputNotNumberMassage();
            continue;
        } else
            break;
    }
    numOfRectangles = (pressEnter(tempInput))? 1:convertToInt(tempInput, all);
    // Create array of rectangles
    Rectangle rectangle[numOfRectangles];
    cout << numOfRectangles << " rectangles are created with a default length of 1 and width of 1 ." << endl;
    cout << "If you want to modify the values, type e. You do not want to modify, press Enter: ";
    cin.getline(tempInput, 6, '\n');
    if(pressEnter(tempInput)){
        for(;;){
            printOptionsMenu(numOfRectangles, 1);
            cin >> tempInput;
            // Verify that the entry is a number
            if(!checkNumber(tempInput, oneChar)){
                printErrorInputNotNumberMassage();
                continue;
            } else
                break;
        }
        switch(tempInput[0]){
            case '1':
                cout << calculate(area, numOfRectangles, tempInput, rectangle) << endl;
            break;
            case '2':
                cout << calculate(perimeter, numOfRectangles, tempInput, rectangle) << endl;
            break;
        }
    } else{ // user want edit the values
        if(numOfRectangles  > 1){
            cout << "Enter number of rectangle you want to edit the values(press a if you want to edit all rectangles values)" << endl;
            printRectanglesMenu(numOfRectangles, rectangle);
            cout << "> ";
            cin >> tempInput;
        }
    }
    return 0;
}
