#include <stdio.h>

int main() {

	int a = 15;
	float f = 3.456;
	double d = 3.4567891235;
	char c = 'E';
	long int la;
	long double ld;

	printf("Kieu int: %d\n", sizeof(int));
	printf("So nguyen: %d\n", a);
	printf("Kieu float: %d\n", sizeof(float));
	printf("So thuc kieu float: %f\n", f);
	printf("Kieu double: %d\n", sizeof(double));
	printf("So thuc kieu double: %lf\n", d);
	printf("Kieu char: %d\n", sizeof(char));
	printf("Ky tu: %c\n", c);
	printf("Kieu long int: %d\n", sizeof(long int));
	printf("Kieu long double: %d\n", sizeof(long double));

	return 0;
}