#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int i, j, rows;

	printf("Enter number of rows: ");
	scanf("%d", &rows);

	for (i = 1; i <= rows; i++) {
		for (j = 1; j <= i; j++)
			printf("%d", j);
		printf("\n");
	}
	return 0;
}