#include <stdio.h>

int main() {

	int m1, m2, m3;
	int per;

	printf("Marks of subject 1: ");
	scanf_s("%d", &m1);

	printf("Marks of subject 2: ");
	scanf_s("%d", &m2);

	printf("Marks of subject 3: ");
	scanf_s("%d", &m3);

	if ((m1 <= 100 && m1 >= 0) && (m2 <= 100 && m2 >= 0) && (m3 <= 100 && m3 >= 0)) {

		per = (m1 + m2 + m3) / 3;

		if (per >= 90 && per <= 100)
			printf("Grade: E+");
		else if (per >= 80 && per < 90)
			printf("Grade: E");
		else if (per >= 70 && per < 80)
			printf("Grade: A+");
		else if (per >= 60 && per < 70)
			printf("Grade: A");
		else if (per >= 50 && per < 60)
			printf("Grade: B+");
		else if (per >= 0 && per < 50)
			printf("FAIL");
		else
			printf("Invalid!");
	}
	else
		printf("Invalid input! Try again");

	return 0;
}