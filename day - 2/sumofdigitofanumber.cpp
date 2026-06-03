#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number : " << endl;
    cin >> n ;
    int sum=0;
    while(n>0){
        int r;
        r=n%10;
        sum+=r;
        n=n/10;

    }
    cout << "the sum of digit of given number "  << " is : " << sum << endl;

}