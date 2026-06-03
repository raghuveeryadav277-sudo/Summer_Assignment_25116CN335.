#include<iostream>
using namespace std;
int main(){
    int startingNumber, endingNumber;
    cout<<"Enter the starting number: ";
    cin>>startingNumber;
    cout<<"Enter the ending number: ";
    cin>>endingNumber;

    cout<<"Prime numbers between "<<startingNumber<<" and "<<endingNumber<<" are: " <<endl;
    for(int num=startingNumber; num<=endingNumber; num++){
        bool isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            cout<<num<<" ";
        }
    }
    
    return 0;
}