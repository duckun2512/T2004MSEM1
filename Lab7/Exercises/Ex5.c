#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int a;
	int ans;
	int sum = 0;

	printf("Menu:\n");
	printf("1.Cappuchino: 6$\n");
	printf("2.Cappuchino Caramel: 6$\n");
	printf("3.Espresso: 4$\n");

	do {
		printf("Choose a number from above to order: ");
		scanf("%d", &a);
		getchar();
		sum++;

		switch (a) {
		case 1:
			printf("You have ordered Cappuchino!\n");
			printf("Price is 6$!\n");
			break;
		case 2:
			printf("You have ordered Cappuchino Caramel!\n");
			printf("Price is 6$!\n");
			break;
		case 3:
			printf("You have ordered Espresso!\n");
			printf("Price is 4$!\n");
			break;
		default:
			printf("Invalid Input! Try again!");
		}

		printf("Want more (Enter any number to choose, otherwise enter 0) ?");
		scanf("%d\n", &ans);

	} while (ans != 0);

	printf("You have ordered %d from the menu!\n", sum);

	return 0;
}