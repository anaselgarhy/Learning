#include <stdio.h>
void main(void){

	union data{
		char ch;
		short sh;
		int myint;
	}x;
	printf("Size of  union is %d\n", sizeof(x));

	x.ch ='A';
	x.sh=4;
	printf("%c", x.ch);
}
