#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a[5][5], b[5][5], c[5][5], i, j;
	int row, col;

	printf("Enter row: ");
	scanf("%d", &row);

	printf("Enter column: ");
	scanf("%d", &col);

	printf("Enter matrix 1: \n");

	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			scanf("%d", &a[i][j]);
		}
	}

	printf("Enter matrix 2: \n");

	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			scanf("%d", &b[i][j]);
		}
	}

	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			c[i][j] = a[i][j] + b[i][j];
		}
	}

	printf("Add two matrices: \n");

	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			printf("%d ", c[i][j]);
		}
		printf("\n");
	}

	return 0;
}