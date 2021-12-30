#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {
	
	int grade;
	printf("Please enter the total\n");
	scanf("%d", &grade);
	grade > 60 ? printf("successful") : printf("Precipitate");
	
	return 0;
}
