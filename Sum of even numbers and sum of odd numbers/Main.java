#include <iostream>
using namespace std;

int main() 
{
  int i,n,e=0,o=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      e += a[i];
    else
      o += a[i];
  }
  
  cout<<"The sum of the even numbers in the array is "<<e<<endl;
  cout<<"The sum of the odd numbers in the array is "<<o;
  return 0;
}