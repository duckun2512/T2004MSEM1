#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int x, y, * px, * py;
	
	// Storing address of x in px
	px = &x;

	//Storing address of y in py
	py = &y;

	x = 15; y = 20;

	printf("x = %d, y = %d \n", x, y);
	swap(px, py);

	// Passing addresses of x and y
	printf("\nAfter interchanging x = %d, y = %d\n", x, y);

}

swap(int* u, int* v) {
	// Accept the values of px and py into u and v

	int temp;
	temp = *u;
	*u = *v;
	*v = temp;
	return;
}