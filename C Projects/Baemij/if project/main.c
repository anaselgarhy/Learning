#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
	int age =18;
	if(age >12 && age < 18){
		printf("Please bring your parents");
	}
	else if(age >=18 && age <= 40){
		printf("you are welcome to enter");
	}
	else{
		printf("You are not allowed in");
	}
	return 0;
}
