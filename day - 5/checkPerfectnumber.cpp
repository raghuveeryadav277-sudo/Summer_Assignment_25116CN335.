#include<iostream>
using namespace std ;
int main()
{
    int n ;
    cout<<"Enter a number : " ;
    cin>>n ;
    int sum = 0 ;
    int temp = n ;
    for(int i = 1 ; i < temp ; i++)
    {
        if(temp % i == 0)
        {
            sum += i ;
        }
    }
    if(sum == n)
    {
        cout<<"The number is a perfect number." ;
    }
    else
    {
        cout<<"The number is not a perfect number." ;
    }
    return 0 ;
}