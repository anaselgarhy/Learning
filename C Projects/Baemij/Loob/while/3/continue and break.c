#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {

	int counter=0;
	while(true){
		counter++;
		if(counter==5)
		continue;
		if(counter==10)
		break;
		printf("%d\n", counter);
		
	}
	
}
