#include<iostream>
using namespace std;
int main ()
{
    int n;
    cout << " Enter a number : " << endl;
    cin >> n;
    int product=1;
    while(n>0){
        int rem;
        rem=n%10;
        product *=rem;
        n=n/10;
    }
    cout << " the product of digit of given number is : " << product << endl;
}