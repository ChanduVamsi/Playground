#include <iostream>
using namespace std;

int main() 
{
  int a,b,sum,c,i;
  cin>>a>>b;
  if(a>b)
  {
    sum = a;
    a = b;
    b = sum;
  }
  sum = 0;
  if(a<2)
    a=1;
  for(++a;a<b;a++)
  {
    c=0;
    for(i=2;i<a;i++)
    {
      if(a%i==0)
      {
        c++;
        break;
      }
    }
    if(c==0)
      sum += a;
  }
  cout<<sum;
  return 0;
}