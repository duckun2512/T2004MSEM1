#include <stdio.h>

int main() {

	int num;
	num = 10;

	printf("\nCountdown");

	while (num >= 0) {
		printf("\n%d", num);
		num--;
	}
	return 0;
}