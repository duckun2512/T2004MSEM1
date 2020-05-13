#include <stdio.h>

int main() {

	int marks;

	printf("Enter marks: ");
	scanf_s("%d", &marks);

	if (marks <= 100 && marks >= 75) {
		printf("Grade: A\n");
	}
	else if (marks < 75 && marks >= 60) {
		printf("Grade: B\n");
	}
	else if (marks < 60 && marks >= 45) {
		printf("Grade: C\n");
	}
	else if (marks < 45 && marks >= 35) {
		printf("Grade: D\n");
	}
	else if (marks < 35 && marks >= 0) {
		printf("Grade: E\n");
	}
	else
		printf("Invalid input\n");

	return 0;
}