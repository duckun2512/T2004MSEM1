#include <stdio.h>

int main() {

	float sales_amt, com;

	printf("Enter the Sales Amount: ");
	scanf_s("%f", &sales_amt);

	if (sales_amt >= 10000)
		com = sales_amt * 0.1;
	
	printf("\nCommission = %f\n", com);
}