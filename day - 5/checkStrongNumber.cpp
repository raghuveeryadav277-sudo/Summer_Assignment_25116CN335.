#include<iostream>
using namespace std;
int factorial(int digit)
{
  int result=1;
    for(int i=1;i<=digit;i++)
    {
        result*=i;
    }
    return result;
}
int main()
{
    int n;
    cout<<"Enter a number : ";
    cin>>n;
    int sum=0;
    int temp=n;
    while(temp>0)
    {
        int digit=temp%10;
        sum+=factorial(digit);
        temp/=10;
    }
    if(sum==n)
    {
        cout<<"The number is a strong number.";
    }
    else
    {
        cout<<"The number is not a strong number.";
    }
    return 0;
}