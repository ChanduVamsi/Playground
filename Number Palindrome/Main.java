#include <iostream>
using namespace std;

int main() 
{
  int i,n,sum=0;
  cin>>n;
  i=n;
  while(i>0)
  {
    sum *= 10;
    sum += i%10;
    i /= 10;
  }
  
  if(sum == n)
    cout<<"Equal";
  else
    cout<<"Not equal";
    return 0;
}