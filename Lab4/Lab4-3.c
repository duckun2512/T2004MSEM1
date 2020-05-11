#include <stdio.h>
#include <conio.h>

int main() {

	int num1, num2;
	
	printf("Nhap so num1 = ");
	scanf_s("%d", &num1);

	printf("Nhap so num2 = ");
	scanf_s("%d", &num2);

	printf("Tong = %d\n", num1 + num2);
	printf("Hieu = %d\n", num1 - num2);
	printf("Tich = %d\n", num1 * num2);
	printf("Thuong = %f\n", (float)num1 / num2);

	_getch();

}