#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	char* ptr[5];
	int i;
	int j;
	char cpyptr1[5][10], cpyptr2[5][10];
	char* temp;

	for (i = 0; i < 5; i++) {
		printf("Enter a string: ");
		scanf("%s", cpyptr1[i]);
		ptr[i] = cpyptr1[i];
	}

	for (i = 0; i < 5; i++)
		strcpy(cpyptr2[i], cpyptr1[i]);

	for (i = 0; i < 4; i++) {
		for (j = i + 1; j < 5; j++) {
			if (strcmp(ptr[i], ptr[j]) > 0) {
				temp = ptr[i];
				ptr[i] = ptr[j];
				ptr[j] = temp;
			}
		}
	}
	printf("\nThe original list is: ");

	for (i = 0; i < 5; i++)
		printf("\n%s", cpyptr2[i]);
	printf("\n\nThe Sorted list is: ");

	for (i = 0; i < 5; i++)
		printf("\n%s", ptr[i]);

	return 0;
}