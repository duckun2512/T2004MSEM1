#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a[100], b[100];
	int n, i, j;

	printf("Enter the number of elements in array: ");
	scanf("%d", &n);

	printf("Enter array elements:\n");

	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (i = n - 1, j = 0; i >= 0; i--, j++)
		b[j] = a[i];

	for (i = 0; i < n; i++)
		a[i] = b[i];

	printf("Reverse array is:\n");

	for (i = 0; i < n; i++)
		printf("%d\n", a[i]);

	return 0;
}