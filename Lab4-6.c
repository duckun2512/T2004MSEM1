#include <stdio.h>

int main() {

	int toan, ly, hoa;
	int tong, tb;

	printf("Diem toan: ");
	scanf_s("%d", &toan);

	printf("Diem ly: ");
	scanf_s("%d", &ly);

	printf("Diem Hoa: ");
	scanf_s("%d", &hoa);

	printf("Tong: %d\n", toan + ly + hoa);
	printf("Trung binh 3 mon: %d\n", (toan + ly + hoa) / 3);

	return 0;
}