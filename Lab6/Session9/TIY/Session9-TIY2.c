#include <stdio.h>

int main() {

	int num1 = 0, num2 = 0;
	int min = 0, max = 0;
	int sum = 0, i;

	printf("First number: ");
	scanf_s("%d", &num1);

	printf("Second number: ");
	scanf_s("%d", &num2);

	if (num1 > num2) {
		min = num2;
		max = num1;
	}
	else {
		max = num2;
		min = num1;
	}

	i = min + 1;

	while ((i > min) && (i < max)) {
		if (i % 2 != 0) {
			sum = sum + i;
		}
		i++;
	}
	printf("sum of all odd numbers from %d to %d: %d ", min, max, sum);

	return 0;
}