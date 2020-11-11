#include <iostream>
using namespace std;

int main() 
{
  int a,b,i;
  cin>>a>>b;
  i=a;
  if(a>b)
    i=b;
  for(i;i>0;i--)
  {
    if(a%i==0 && b%i==0)
    {
      break;
    }
  }
  cout<<i;
  return 0;
}