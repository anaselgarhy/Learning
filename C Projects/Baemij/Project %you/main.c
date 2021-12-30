#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {
	
	int x=123;
	int a1=x % 10;
	printf("%d", a1);
	int a2=(x/10)% 10;
	printf("%d", a2);
	int a3=x/100;
	printf("%d",a3);
	return 0;
}
