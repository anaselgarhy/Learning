#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {
	
	int x;
	do{
		printf("Please enter the num\n");
		scanf("%d", &x);
		printf("____ %d\n", x);
	}while(x != 0);
	
	}
