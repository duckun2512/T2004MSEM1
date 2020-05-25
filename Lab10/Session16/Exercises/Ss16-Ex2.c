#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a, b, c, sum;

	printf("\nEnter any three numbers: ");
	scanf("%d %d %d", &a, &b, &c);

	sum = calculatesum(a, b, c);

	printf("\nSum = %d", sum);

	return 0;
}

calculatesum(int x, int y, int z) {
	int d;
	d = x + y + z;
	return d;
}