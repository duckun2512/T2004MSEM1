#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int i, n, sum = 0;
	int a;

	printf("Enter an integer\n");
	scanf("%d", &n);

	i = n;

	while (i != 0) {
		a = i % 10;
		sum += a;
		i = i / 10;
	}

	printf("Sum of digits of %d = %d\n", n, sum);

	return 0;
}