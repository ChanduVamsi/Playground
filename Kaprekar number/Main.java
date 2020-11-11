#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int i,n,count=1,sq,po,f,s;
    cin>>i;
    n=i;
    while(n/=10)
        count++;
    sq=pow(i,2);
    po=pow(10,count);
    f = sq%po;
    s=sq/po;
    if(f+s==i)
        cout<<"Kaprekar Number";
    else
        cout<<"Not a Kaprekar Number";
    return 0;
}