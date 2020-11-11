#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  int s,n,m,res;
  cin>>s>>n>>m;
  res = pow(s,n);
  res %= 10;
  res = pow(res,m);
  res %= 1000000007;
  cout<<res;
  return 0;
}