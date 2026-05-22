#include<stdio.h>
int main()
{
    int n, count = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    while (n > 0)
    {   
        n = n / 10; // Remove the last digit
        count++; // Increment the count of digits
    }
    printf("The number of digits in the entered number is: %d", count);
    return 0;
}