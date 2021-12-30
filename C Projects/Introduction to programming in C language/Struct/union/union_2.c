#include <stdio.h>

struct color_rgb{
    unsigned char r;  // Red value
    unsigned char g;  // Green value
    unsigned char b;  // Blue value
};
union color{
    struct color_rgb rgb;   // RGB color
    unsigned int hexvalue;  // integer color value
    char name[10];          // String name of color
};
void main(void){

    // Declare color variable
    union color console_color;

    printf("Size of color variable = %d\n\n", sizeof(console_color));

    printf("Enter space separated RGB color value: ");
    scanf("%d %d %d", &console_color.rgb.r, &console_color.rgb.g, &console_color.rgb.b);
    printf("Color in RGB format: %d,%d,%d\n\n", console_color.rgb.r, console_color.rgb.g, console_color.rgb.b);

    printf("Enter HEXADECIMAL color value: ");
    scanf("%x", &console_color.hexvalue);
    printf("Color in HEXADECMAL format: %x\n\n", console_color.hexvalue);

    printf("Enter string color value: ");
    fflush(stdin); // Eat extra new line character
    gets(console_color.name);
    printf("Color in string format: %s\n\n", console_color.name);
}
