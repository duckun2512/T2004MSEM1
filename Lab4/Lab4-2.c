#include <stdio.h>
#include <conio.h>

int main() {

	int num = 10;
	char ch = 'A';
	float f = 25.3;
	double d = 25.3;
	
	//In ra số nguyên
	printf("num = %d\n", num);
	
	//In ra kí tự
	printf("ch = %c\n", ch);
	
	//In ra số thập phân lấy 2 chữ số sau dấy phẩy
	printf("f = %.2f\n", f);

	//In ra số thập phân không hạn chế
	printf("d = %f\n", d);

	_getch();

}