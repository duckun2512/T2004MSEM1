#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	char string[20];
	
	printf("Enter a string: ");
	gets(string);

	for (int i = 0; i < strlen(string); i++) {
		if (string[i] >= 65 && string[i] <= 90) {
			string[i] += 32;
		}
	}

	printf("Lower case of the string: %s\n", string);
	return 0;
}