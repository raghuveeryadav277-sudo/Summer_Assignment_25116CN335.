#include<iostream>
using namespace std;
int main(){
    int n1 , n2 ;
    cout << " Enter first number : " ;
    cin>>n1 ;
    cout<< " Enter second number : " ;
    cin >> n2 ;
    int i ;
    int smallestnumber = n1 ;
    if(n2< smallestnumber){
        smallestnumber = n2 ;
    }
    for(i=smallestnumber ; i>=1 ; i--){
        if(n1%i==0 && n2%i==0)
        {
            break ;
        }
    }
    cout << " GCD of " << n1 <<" and "<<n2<< " are : " << i <<endl ;

return 0;    
}