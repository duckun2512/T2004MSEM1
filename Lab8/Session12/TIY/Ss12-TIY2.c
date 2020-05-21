#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	char s[1000];
	int i, vowels = 0, consonants = 0;

	printf("Enter the string: ");
	gets(s);

	for (i = 0; s[i]; i++) {
		if ((s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122)) {
			if (s[i] == 'a' || s[i] == 'A' || s[i] == 'e' || s[i] == 'E' || s[i] == 'i' || s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U')
				vowels++;
			else
				consonants++;
		}
	}

	printf("Number of vowels in string: %d\n", vowels);
	printf("Number of consonants in string: %d\n", consonants);

	return 0;
}