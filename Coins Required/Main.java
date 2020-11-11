#include<iostream>
using namespace std;

int main()
{
  int n,one,two,five;
  cin>>n;
  
  five = (n-4)/5;
  n -= (five*5);
  
  if(n%2==0)
    one=2;
  else
    one=1;
  n -= one;
  
  two = n/2;
  n -= two*2;
  
  cout<<five+two+one<<" "<<five<<" "<<two<<" "<<one;
  return 0;
}