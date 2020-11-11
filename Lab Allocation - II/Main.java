#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  string s;
  cin>>a>>b>>c>>s;
  if(s=="L1")
    a += 100;
  else if(s=="L2")
    b += 100;
  else
    c += 100;
  if (a<b && a<c)
    cout<<"L1";
  else if (b<c && b<a)
    cout<<"L2";
  else
    cout<<"L3";
  return 0;
}