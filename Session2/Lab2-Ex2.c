#include <stdio.h>

int main() {
	char abc;
	int xyz;
	float length;
	double area;
	long liteyrs;
	short arm;

	printf("Enter a character:\n");
	scanf_s("%c", &abc);

	printf("Enter an integer:\n");
	scanf_s("%d", &xyz);

	printf("Enter a float:\n");
	scanf_s("%f", &length);

	printf("Enter a double:\n");
	scanf_s("%lf", &area);

	printf("Enter a short int:\n");
	scanf_s("%hd", &arm);

	printf("Enter a long int:\n");
	scanf_s("%ld", &liteyrs);

//////////////////////////////////////

	printf("Character: %c\n", abc);
	printf("Integer: %d\n", xyz);
	printf("Float: %f\n", length);
	printf("Double: %lf\n", area);
	printf("Long int: %ld\n", liteyrs);
	printf("Short int: %hd\n", arm);

	return 0;
}