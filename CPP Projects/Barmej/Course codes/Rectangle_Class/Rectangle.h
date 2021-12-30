#include <iostream>
using namespace std;
#ifndef RECTANGLE_CLASS_RECTANGLE_H
#define RECTANGLE_CLASS_RECTANGLE_H


class Rectangle {
private:
    float height;
    float width;
public:
    Rectangle();
    void setHeight(float height);
    float getHeight();
    void setWidth(float width);
    float getWidth();
    float area();
    float perimeter();
};


#endif //RECTANGLE_CLASS_RECTANGLE_H
