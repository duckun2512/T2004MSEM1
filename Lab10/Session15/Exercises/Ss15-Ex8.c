#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

void check(char* a, char* b, int (*cmp)());
int main() {

	char s1[80], s2[80];
	int(*p)();
	p = strcmp;
	gets(s1);
	gets(s2);
	check(s1, s2, p);
}

void check(char* a, char* b, int (*cmp)()) {
	printf("testing for equality \n");

	if (!(*cmp)(a, b))
		printf("Equal");
	else
		printf("Not Equal");
}