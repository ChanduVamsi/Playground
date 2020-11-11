#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
  int res=0;
  while(n>0)
  {
    res *= 10;
    res += n%8;
    n /= 8;
  }
  n=0;
  while(res>0)
  {
    n *= 10;
    n += res%10;
    res /= 10;
  }
  return n;
}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
