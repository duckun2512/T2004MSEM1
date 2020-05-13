#include <stdio.h>

int main() {

	int x, y;
	x = y = 0;

	printf("Enter Choice (1 - 3) :");
	scanf_s("%d", &x);

	if (x == 1) {
		printf("\nEnter value for y (1 - 5) :");
		scanf_s("%d", &y);

		if (y <= 5)
			printf("\nThe value for y is : %d", y);
		else
			printf("\nThe value of y exceeds 5");
	}
	else
		printf("\nChoice entered was not 1");
}