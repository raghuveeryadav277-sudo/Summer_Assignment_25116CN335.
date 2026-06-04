#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int start, end;
    cout << " Enter the starting number : " ;
    cin >> start;
    cout << " Enter the ending number : " ;
    cin >> end;
    for(int n=start; n<=end; n++)
    {
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
            sum =sum +round(pow(digit, power));
            temp = temp / 10;
        }
        if (sum == n)
        {
            cout << n << " ";
        }
    
}
    return 0;

}