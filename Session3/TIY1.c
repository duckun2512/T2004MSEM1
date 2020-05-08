#include <stdio.h>

int main() {
	int area, perimeter;
	int r;

	printf("Radius of circle: ");
	scanf_s("%d", &r);

	area = r * 3.14;
	perimeter = (r + r) * 3.14;

	printf("Area of circle is: %d\n", area);
	printf("Perimeter of circle is: %d", perimeter);

	return 0;
}