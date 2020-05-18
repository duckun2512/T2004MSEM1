#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int asm, written, practice;

	printf("Enter ASM: ");
	scanf("%d", &asm);

	if (asm >= 0 && asm <= 10) {
		if (asm >= 4)
			printf("ASM Passed!\n");
		else
			printf("ASM Failed!\n");
	}
	else
		printf("Invalid Input! Try again!\n");

	printf("Enter Written: ");
	scanf("%d", &written);

	if (written >= 0 && written <= 100) {
		if (written >= 40)
			printf("Written Passed!\n");
		else
			printf("Written Failed!\n");
	}
	else
		printf("Invalid Input! Try again!\n");

	printf("Enter practice: ");
	scanf("%d", &practice);

	if (practice >= 0 && practice <= 15) {
		if (practice >= 6)
			printf("Practice Passed!\n");
		else
			printf("Practice Failed!\n");
	}
	else
		printf("Invalid Input! Try again!\n");

}