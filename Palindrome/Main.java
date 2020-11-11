#include <iostream>
using namespace std;

int main() 
{
  int n,x,sum=0;
  cin>>n;
  x = n;
  while(n>0)
  {
    sum *= 10;
    sum += n%10;
    n /= 10;
  }
  if(sum==x)
    cout<<"Palindrome";
  else
    cout<<"Not a Palindrome";
  return 0;
}