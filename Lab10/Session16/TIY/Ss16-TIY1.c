#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

float area(float x) {
	float area;
	area = x * x * 3.14;
	return area;
}

float perimeter(float y) {
	float perimeter;
	perimeter = y * 2 * 3.14;
	return perimeter;
}

int main() {

	float r;
	float a, b;

	printf("Enter circle's radius: ");
	scanf("%f", &r);
	
	a = area(r);
	printf("\nArea of circle is: %.2f\n", a);

	b = perimeter(r);
	printf("Perimeter of circle is: %.2f\n", b);

	return 1;
}

