#include<bits/stdc++.h>
using namespace std;

int main(){  
    int n, i, count = 0;
    cin>>n;
    for(i = 2; i < n; i++)
    {
        if(n%i == 0)
        {
            count = 1;   
        }
    }
       if(count  ==  0)
       {
     	cout<<i<<" is Prime\n";
       }
      else{
      	cout<<i<<" is Not Prime\n";
      }
  return 0;
} 
    	

