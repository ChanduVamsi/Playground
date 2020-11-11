#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  int i,n;
  cin>>n;
  float f = sqrt(n);
  for(i=2;i<n;i++)
  {
    if(n%i==0)
    {
      f = 0;
      break;
    }
  }
  printf("%.2f",f);
  return 0;
}