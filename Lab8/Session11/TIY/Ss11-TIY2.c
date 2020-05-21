#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a = 0, count = 0;
	char string[1000];

	printf("Input a string\n");
	gets(string);

	while (string[a] != '\0') {
		if (string[a] == 'a' || string[a] == 'A' || string[a] == 'e' || string[a] == 'E' || string[a] == 'i' || string[a] == 'I' || string[a] == 'o' || string[a] == 'O' || string[a] == 'u' || string[a] == 'U')
			count++;
		a++;
	}

	printf("Number of vowels in the string: %d", count);

	return 0;
}