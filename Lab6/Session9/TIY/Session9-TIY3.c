#include <stdio.h>

int main() {

	int a = 1, b = 1, c = 1, i = 1;

	while (i < 13) {
		a = b;
		b = c;
		c = a + b;

		printf("%d", a);
		i++;
	}
	return 0;
}