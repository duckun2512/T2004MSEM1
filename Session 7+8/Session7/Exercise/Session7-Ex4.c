#include <stdio.h>

int main() {

	char c;
	
	printf("Please enter a character : ");
	scanf_s("%c", &c);

	if (c >= 'A' && c <= 'Z') {
		printf("Lowercase character = %c", c + 'a' - 'A');
	}
	else
		printf("Character Entered is = %c", c);
}