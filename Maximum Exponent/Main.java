#include <iostream>
using namespace std;

int exponents(int n)
{
  int res=0;
  while(n%2==0)
  {
    res++;
    n /= 2;
  }
  return res;
}

int main() 
{
  int x,a,b,max=0,res;
  cin>>a>>b;
  while(a<=b)
  {
    x = exponents(a);
    if(max<x)
    {
      max = x;
      res = a;
    }
    a++;
  }
  cout<<res;
  return 0;
}