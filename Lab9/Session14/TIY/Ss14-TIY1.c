#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int l, i;
	char *ptr1, *ptr2, ch;
	char str[100];

	printf("Enter a string: ");
	gets(str);

	l = strlen(str);

	ptr1 = str;
	ptr2 = str;

	// move to the last character
	for (i = 0; i < l - 1; i++)
		ptr2++;

	// swap the char from start and end
	for (i = 0; i < l / 2; i++) {
		// swap
		ch = *ptr2;
		*ptr2 = *ptr1;
		*ptr1 = ch;

		// update pointers positions
		ptr1++;
		ptr2--;
	}

	printf("Reverse string: %s\n", str);

	return 0;
}