#include <stdio.h>

int main() {

	int num, res;

	printf("Enter a number :");
	scanf_s("%d", &num);

	res = num % 2;

	if (res == 0) {
		printf("The number is Even");
	}
	else
		printf("The number is Odd");
}