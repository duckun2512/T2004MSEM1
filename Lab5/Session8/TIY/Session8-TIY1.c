#include <stdio.h>

int main() {

	int x, y;
	
	printf("Assign value for x: ");
	scanf_s("%d", &x);

	printf("Assign value for y: ");
	scanf_s("%d", &y);

	if ((x < 2000 || x > 3000) && (y <= 500 && y >= 100)) {
		printf("x is: %d\n", x);
		printf("y is: %d\n", y);
	}
	else
		printf("Invalid input, please try again!");

	return 0;
}