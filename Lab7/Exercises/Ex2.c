#include <stdio.h>

int main() {

	int num;

	//while (num <= 100) {
	//	printf("%d\t", num);
	//	num += 5;
	//}

	for (num = 0; num <= 100; num += 5) {
		printf("%d\t", num);
	}

	return 0;
}