#include <iostream>
using namespace std;

int main() 
{
  long int i=0,n;
  cin>>n;
  while(n>0)
  {
    i *= 10;
    i += n%10;
    n /= 10;
  }
  cout<<i;
  return 0;
}