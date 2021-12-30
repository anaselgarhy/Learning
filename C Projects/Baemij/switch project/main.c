#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
	
	int cost=8;
	switch(cost){
		case 2:
			printf("yes");
			break;
		case 3:
			printf("No");
			break;
		default:
			printf("Ohh");
	}
	
	return 0;
}
