#include <stdio.h>

int main() {

	int i, j, rows;

	printf("Enter number of rows: ");
	scanf_s("%d", &rows);

	for (i = 1; i <= rows; i++) {
		for (j = i; j <= rows; j++)
			printf("*");
		printf("\n");
	}
}