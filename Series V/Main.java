#include<iostream>
#include <math.h>
using namespace std;

int main()
{
  //Type your code here.
  int i=0,n,x=11;
  cin>>n;
  while(i<n)
  {
    cout<<pow(x,2)<<" ";
    x += 4;
    i++;
  }
  return 0;
}