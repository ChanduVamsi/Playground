#include <iostream>
using namespace std;

int main()
{
  int n,r,sum=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    sum += r;
    n=n/10;
  }
  cout<<sum;
  //Type your code here
  return 0;
}