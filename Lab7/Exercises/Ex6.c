#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int card, pin;
	int money = 10000000;
	int cashout;
	char ans;

	printf("Enter your card number: ");
	scanf("%d", &card);

	printf("Enter your PIN: ");
	scanf("%d", &pin);

	if (card = 123, pin = 124) {
		printf("Login Successful!\n");
		do {
			printf("You have %d$, how much you want to cashout? ", money);
			scanf("%d", &cashout);

			money -= cashout;

			printf("Again (Y/N) ?\n");
			getchar();
			scanf("%c", &ans);

		} while (ans == 'Y' || ans == 'y');
	}
	else
		printf("Invalid! Try again!\n");

	printf("Money left: %d$\n", money);
	printf("Cashout: %d$\n", cashout);

	return 0;
}