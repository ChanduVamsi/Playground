#include <iostream>
using namespace std;

int main() 
{
  long int n,res=1;
  cin>>n;
  while(n>0)
  {
    res *= n;
    n--;
  }
  cout<<res;
  return 0;
}