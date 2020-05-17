#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int age;
	char name;

	printf("Enter your name: ");
	scanf("%c\n", &name);

	printf("Enter your age: ");
	scanf(" %d", &age);

	if (age <= 0)
		printf("Invalid! Try again!");
	else {
		for (int i = 1; i <= age; i++)
			printf("%c\n", name);
	}
	return 0;
}