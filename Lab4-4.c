#include <stdio.h>

int main() {

	float celsius, fahrenheit;

	printf("Input Celsius: ");
	scanf_s("%f", &celsius);

	fahrenheit = celsius / 5 * 9 + 32;

	printf("\nFahrenheit: %.1f\n", fahrenheit);

	return 0;
}