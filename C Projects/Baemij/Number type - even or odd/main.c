#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
	int input=1;
	printf("Please enter the number whose type you want to know\n");
	scanf("%d", &input);
	int output=input % 2;
	if(output == 0){
		printf("The type of number %d is even", input);
	}
	else{
		printf("The type of number %d is odd", input);
	}
	return 0;
}
