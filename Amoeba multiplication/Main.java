#include<iostream>
using namespace std;
int main()
{
  int i,n,a=0,b=1,temp;
  cin>>n;
  if(n>=2)
  {
    for(i=3;i<=n;i++)
    {
      temp=a;
      a=b;
      b+=temp;
    }
    cout<<b;
  }
  else
    cout<<a;
}