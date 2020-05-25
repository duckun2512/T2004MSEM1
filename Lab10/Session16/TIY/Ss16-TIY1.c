#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	float r,*pr;
	float a, b;

	printf("Enter circle's radius: ");
	scanf("%f", &r);

	pr = &r;
	
	a = area(pr);
	printf("\nArea of circle is: %.2f\n", a);

	b = perimeter(pr);
	printf("Perimeter of circle is: %.2f\n", b);
}

area(float *x) {
	float area;
	area = (*x) * (*x) * 3.14;
	return area;
}

perimeter(float *y) {
	float perimeter;
	perimeter = *y * 2 * 3.14;
	return perimeter;
}