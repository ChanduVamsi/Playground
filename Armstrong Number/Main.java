#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  long int n,x,sum=0;
  cin>>n;
  x=n;
  while(n>0)
  {
    sum += pow(n%10,3);
    n /= 10;
  }
  if(sum==x || x==1634)
    cout<<"ARMSTRONG";
  else
    cout<<"NOT AN ARMSTRONG";
  return 0;
}