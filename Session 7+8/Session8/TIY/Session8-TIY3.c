#include <stdio.h>

int main() {

	int a, b, c;

	printf("Enter the first number: ");
	scanf_s("%d", &a);

	printf("Enter the second number: ");
	scanf_s("%d", &b);

	printf("Enter the third number: ");
	scanf_s("%d", &c);

	if ((a > b) && (a > c))
		printf("Highest number is %d", a);
	else if ((b > a) && (b > c))
		printf("Highest number is %d", b);
	else if ((c > a) && (c > b))
		printf("Highest number is %d", c);
	else
		printf("Invalid! Try again");

	return 0;
}