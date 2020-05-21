#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int ary[10];
	int i, total, high, low;

	for (i = 0; i < 10; i++) {
		printf("\nEnter value: %d: ", i + 1);
		scanf("%d", &ary[i]);
	}

	high = ary[0];
	for (i = 1; i < 10; i++) {
		if (ary[i] > high)
			high = ary[i];
	}
	printf("\nHighest value entered was %d", high);

	for (i = 0, total = 0; i < 10; i++) {
		total = total + ary[i];
	}
	printf("\nThe average of the elements of ary is %d", total / i);
	printf("\nSum of the elements of ary is %d", total);

	low = ary[0];
	for (i = 1; i < 10; i++) {
		if (ary[i] < low)
			low = ary[i];
	}
	printf("\nLowest value entered was %d\n", low);
}