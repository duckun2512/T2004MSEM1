#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int var = 500, * ptr_var;

	/* var is declared as an integer and ptr_var as a pointer pointing to an integer */

	ptr_var = &var; // stores address of var in ptr_var

	// Prints value of variable (var) and address where var is stored

	printf("The value %d is stored at address %u: ", var, &var);

	// Prints value stored in ptr variable (ptr_var) and address where ptr_var is stored

	printf("\nThe value %u is stored at address: %u", ptr_var, &ptr_var);

	// Prints value of variable (var) and address where var is stored, using pointer to variable

	printf("\nThe value %d is stored at address: %u", *ptr_var, ptr_var);
}