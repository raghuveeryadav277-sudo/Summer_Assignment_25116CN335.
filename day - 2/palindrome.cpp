#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << " Enter a number : " << endl;
    cin >> n;
    int temp=n;
    int reverse=0;
    while(n>0){
        int rem ;
        rem = n%10;
        reverse = reverse*10 + rem;
        n=n/10;

    }
    if(temp==reverse){
        cout << " Given number is palindrome " << endl;

    }
    else{
        cout << " Given number is not palindrome " << endl;
    }
}