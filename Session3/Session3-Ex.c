#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS
#define _CRT_SECURE_NO_WARNINGS

int main() {
	int num, square;

	printf("value:");
	scanf_s("%d", &num);

	square = num * num;

	printf("Square of the number %d is: %d", num, square);

	return 0;
}

