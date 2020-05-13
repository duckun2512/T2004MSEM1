#include <stdio.h>


int CheckDivision(int a, int b) {
	if (a % b == 0)
		return 1;
	else
		return 0;
	}

int main() {

	int a = 0, b = 0;

	printf("Enter any interger number: ");
	scanf_s("%d", &a);

	printf("Enter divisor: ");
	scanf_s("%d", &b);

	if (CheckDivision(a, b))
		printf("%d is divisible by %d\n", a, b);
	else
		printf("%d is not divisible by %d\n", a, b);

	return 0;
}