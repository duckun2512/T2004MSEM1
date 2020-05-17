#include <stdio.h>

int main() {

	int a, i;
	unsigned long fact;

	printf("Enter a number: ");
	scanf_s("%d", &a);

	if (a < 0)
		printf("Error! Factorial doesn't exist! Try again!");
	else {
		for (i = 1; i <= a; i++)
			fact *= i;

		printf("Factorial of %d = %lu", a, fact);
	}
	return 0;
}