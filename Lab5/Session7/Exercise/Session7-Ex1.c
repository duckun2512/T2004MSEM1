#include <stdio.h>

int main() {

	int x, y;
	char a = 'y';

	x = y = 0;

	if (a == 'y') {
		x += 5;
		printf("The numbers are %d and \t%d", x, y);
	}
}