#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int i;
	
	for (i = 1; i <= 10; i++)
		printf("\nSquare of %d is %d ", i, squarer(i));
}

squarer(int x) {
	/* int x*/
	int j;
	j = x * x;
	return(j);
}