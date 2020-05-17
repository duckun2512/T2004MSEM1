#include <stdio.h>

int main() {

	int cnt, cnt1;
	cnt = cnt1 = 0;

	do {
		printf("\nEnter a number: ");
		scanf_s("%d", &cnt);
		
		printf("No. is %d", cnt);
		
		cnt1++;

	} while (cnt != 0);

	printf("\nThe total numbers entered were %d", --cnt1);
	
	return 0;
}