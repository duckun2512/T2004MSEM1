#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	char name[10][8], name1[10][8], temp[8];
	int i, j, n;

	printf("Enter the value of names \n");
	scanf("%d", &n);
	printf("Enter %d names \n", n);

	for (i = 0; i < n; i++) {
		scanf("%s", name[i]);
		strcpy(name1[i], name[i]);
	}

	for (i = 0; i < n - 1; i++) {
		for (j = i + 1; j < n; j++) {
			if (strcmp(name[i], name[j]) > 0) {
				strcpy(temp, name[i]);
				strcpy(name[i], name[j]);
				strcpy(name[j], temp);
			}
		}
	}

	printf("\n-----------------------------\n");
	printf("Input Names\tSorted Names\n");
	printf("-----------------------------\n");

	for (i = 0; i < n; i++) {
		printf("%s\t\t%s\n", name1[i], name[i]);
	}

	printf("-----------------------------\n");
}