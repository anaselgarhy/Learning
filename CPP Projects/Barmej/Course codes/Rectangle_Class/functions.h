#ifndef RECTANGLE_CLASS_FUNCTIONS_H
#define RECTANGLE_CLASS_FUNCTIONS_H

#include "Rectangle.h"
typedef enum of{
    all,
    oneChar
	};
typedef enum calcType{
    area,
    perimeter
};
int convertToInt(char *ch, of t);
bool pressEnter(char *input);
void printOptionsMenu(int numOfRectangles, short numOfMenu);
void printRectanglesMenu(int numOfRectangles, Rectangle rectangles[]);
bool checkNumber(char *input, of t);
void printErrorInputNotNumberMassage();
float calculate(calcType type, int numOfRectangles, char *input, Rectangle rectangles[]);
#endif //RECTANGLE_CLASS_FUNCTIONS_H

