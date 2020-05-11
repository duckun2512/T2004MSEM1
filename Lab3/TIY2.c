#include <stdio.h>

int main() {
	int salary, age;

	printf("Salary: ");
	scanf_s("%d", &salary);

	printf("Age: ");
	scanf_s("%d", &age);

	printf("The user's salary is: %d$\n", salary);
	printf("The user's age is: %d\n", age);

	return 0;
}