#include <stdio.h>

int main() {

	int a, b, c;

	printf("Enter the first number: ");
	scanf_s("%d", &a);

	printf("Enter the second number: ");
	scanf_s("%d", &b);

	c = a * b;

	if (c >= 1000)
		printf("\nThe product of two numbers exceeds 1000");
	else
		printf("\nThe product of two numbers does not exceed 1000");

	return 0;
}