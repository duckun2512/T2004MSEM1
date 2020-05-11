#include <stdio.h>

int main() {

	float S_hv, hv, S_ht, ht, S_hcn, hcn;
	float canh_hv, r, dai, rong;

	printf("Canh hinh vuong: ");
	scanf_s("%f", &canh_hv);

	S_hv = canh_hv * canh_hv;
	hv = canh_hv * 4;

	printf("Chu vi va dien tich hinh vuong: %.2f va %.2f\n", hv, S_hv);

	printf("Ban kinh hinh tron: ");
	scanf_s("%f", &r);

	S_ht = r * r * 3.14;
	ht = r * 2 * 3.14;

	printf("Chu vi va dien tich hinh tron: %.2f va %.2f\n", ht, S_ht);

	printf("Chieu dai hinh chu nhat: ");
	scanf_s("%f", &dai);

	printf("Chieu rong hinh chu nhat: ");
	scanf_s("%f", &rong);

	hcn = (dai + rong) * 2;
	S_hcn = dai * rong;

	printf("Chu vi va dien tich hinh chu nhat: %.2f va %.2f\n", hcn, S_hcn);

	return 0;
}