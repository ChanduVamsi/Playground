#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(b<a)
    b += 100;
  cout<<b-a;
}