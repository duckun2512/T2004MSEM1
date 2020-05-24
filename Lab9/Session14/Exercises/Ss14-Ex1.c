#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	char* ptr;
	char word[10];
	int i, vowcnt = 0;

	printf("\nEnter a word: ");
	scanf("%s", word);

	ptr = &word[0];

	for (i = 0; i < strlen(word); i++) {
		if ((*ptr == 'a') || (*ptr == 'A') || (*ptr == 'e') || (*ptr == 'E') || (*ptr == 'i') || (*ptr == 'I') || (*ptr == 'o') || (*ptr == 'O') || (*ptr == 'u') || (*ptr == 'U'))
			vowcnt++;
		ptr++;
	}

	printf("\nThe word is: %s \nThe number of vowels in the word is: %d", word, vowcnt);
	return 0;
}