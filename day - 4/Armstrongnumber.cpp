#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n;
    cout << " Enter a number : " ;
    cin >> n;
    int power=0;
    int sum=0;
    int temp=n;
    while (temp > 0)
    {
        temp = temp / 10; // Remove the last digit
        power++; // Increment the count of digits
    }
    temp = n;
    while (temp > 0)
    {
        int digit = temp % 10;
        sum += pow(digit, power);
        temp = temp / 10;
    }
    if (sum == n)
    {
        cout << " The number is an Armstrong number. ";
    }
    else
    {
        cout << " The number is not an Armstrong number. ";
    }
    return 0;

}