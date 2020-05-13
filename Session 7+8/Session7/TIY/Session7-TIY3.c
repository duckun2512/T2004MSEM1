#include <stdio.h>

int main() {

	int a, b, c;

	printf("Enter the first number: ");
	scanf_s("%d", &a);

	printf("Enter the second number: ");
	scanf_s("%d", &b);

	c = a - b;
	
	if (c == a)
		printf("Difference is equal to value 1\n");
	else if (c == b)
		printf("Difference is equal to value 2\n");
	else
		printf("Difference is not equal to any of the values entered\n");

	return 0;
}