#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a[1000], i, n, min, max;

	printf("Enter size of the array: ");
	scanf("%d", &n);

	printf("Enter elements in array: \n");

	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	min = a[0];
	max = a[0];

	for (i = 1; i < n; i++) {
		if (min > a[i])
			min = a[i];
		if (max < a[i])
			max = a[i];
	}

	printf("Min of array is: %d\n", min);
	printf("Max of array is: %d\n", max);

	return 0;
}