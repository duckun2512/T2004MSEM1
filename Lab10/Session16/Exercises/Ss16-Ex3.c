#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;

	printf("Enter the number: ");
	scanf("%d", &a);
	printf("Square of %d is %d", a, square(a));
}

square(int x) {
	int i;
	i = x * x;
	return i;
}