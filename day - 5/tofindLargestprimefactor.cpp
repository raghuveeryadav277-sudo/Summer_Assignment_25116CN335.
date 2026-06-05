#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter a number : ";
    cin>>n;
    int largestPrimeFactor = -1;
   int temp = n;
   bool isPrime = true;
   for(int i=n ; i>=1 ; i--)
   {
    //calculate factor of n
        if(temp%i==0){
            int factor=i;
            //check if the factor is prime or not
            isPrime = true;
            for(int j=2 ; j<=factor/2 ; j++)
            {
                if(factor%j==0)
                {   
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && factor>largestPrimeFactor)
            {
                largestPrimeFactor = factor;
            }
        }
   }
    cout<<"The largest prime factor of the number is : "<<largestPrimeFactor;
    return 0;
}