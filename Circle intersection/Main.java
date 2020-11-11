#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x1,y1,r1,x2,y2,r2,a,b,c,d;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  a=pow((x1-x2),2);
  b=pow((y1-y2),2);
  c=sqrt(a+b);
  d=r1+r2;
  if(c<d)
    cout<<"Overlap";
  else if(c==d)
    cout<<"Tangential";
  else
    cout<<"Do not Overlap";
  return 0;
}