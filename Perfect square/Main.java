#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  long double i,n;
  cin>>n;
  i = sqrt(n);
  if(i-floor(i)==0)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}