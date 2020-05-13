#include <stdio.h>

int main() {

	char cap;

	printf("Type in a letter: ");
	scanf_s("%c", &cap);

	switch (cap) {
	case 'A':
	case 'a':
		printf("Ada");
		break;
	case 'B':
	case 'b':
		printf("Basic");
		break;
	case 'C':
	case 'c':
		printf("COBOL");
		break;
	case 'D':
	case 'd':
		printf("dBASE III");
		break;
	case 'F':
	case 'f':
		printf("Fortran");
		break;
	case 'P':
	case 'p':
		printf("Pascal");
		break;
	case 'V':
	case 'v':
		printf("Visual C++");
		break;
	default:
		printf("Input does not match! Please try again!");
		break;
	}
	return 0;
}