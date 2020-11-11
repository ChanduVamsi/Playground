#include <iostream>
using namespace std;

int fact(int n)
{
  int prod=1;
  for(int i=2;i<=n;i++)
  {
    prod *= i;
  }
  return prod;
}

int main() 
{
  int i,n,sum=0;
  cin>>n;
  i=n;
  while(n>0)
  {
    sum += fact(n%10);
    n /= 10;
  }
  if(sum==i)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}