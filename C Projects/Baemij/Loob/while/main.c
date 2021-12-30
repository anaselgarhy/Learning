#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {
	
	int grade;
	printf("Enter the student’s score or type -1 to exit\n");
	scanf("%d", &grade);
	while(grade!= -1){
		if(grade>60){
			printf("You are successful\n");
		}
		else{
			printf("You are a failure\n");
		}
	printf("Enter the student’s score or type -1 to exit\n");
	scanf("%d", &grade);
	}
	
	
	return 0;
}
