
#include "Rectangle.h"
Rectangle::Rectangle(){
    setHeight(1.0);
    setWidth(2.0);
}
void Rectangle::setHeight(float height){
    Rectangle::height = (height > 0 && height < 20)? height:Rectangle::height;
}
float Rectangle::getHeight(){
    return height;
}
void Rectangle::setWidth(float width){
    Rectangle::width = (width < 20 && width > 0)? width:Rectangle::width;
}
float Rectangle::getWidth(){
    return width;
}
float Rectangle::area(){
    return height * width;
}
float Rectangle::perimeter(){
    return 2 * (height + width);
}
