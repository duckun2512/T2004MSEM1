#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {

	int salary, basic;
	char grade;

	printf("Enter basic salary: ");
	scanf_s("%d", &basic);

	printf("Enter grade: ");
	scanf("%c", &grade);
	getchar();

	if (grade = 'A') {
		salary = basic + 300;
		printf("\nSalary at the end of month: %d\n", salary);
	}
	else if (grade = 'B') {
		salary = basic + 250;
		printf("\nSalary at the end of month: %d\n", salary);
	}
	else {
		salary = basic + 100;
		printf("\nSalary at the end of month: %d\n", salary);
	}

	return 0;
}