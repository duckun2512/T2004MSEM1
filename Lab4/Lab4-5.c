#include <stdio.h>

int main() {

	int height, top, bottom, s;

	printf("Top: ");
	scanf_s("%d", &top);

	printf("Height: ");
	scanf_s("%d", &height);

	printf("Bottom: ");
	scanf_s("%d", &bottom);

	s = height * ((bottom + top) / 2);

	printf("Area: %d", s);

	return 0;
}