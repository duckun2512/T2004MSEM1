#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int n;

	printf("Enter a number: ");
	scanf("%d", &n);

	printf("Factorial of %d is: %d\n", n, factorial(n));
}

int factorial(int x) {
	int i;
	int fact = 1;

	for (i = 1; i <= x; i++)
		fact *= i;

	return fact;
}