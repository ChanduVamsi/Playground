#include <iostream>
using namespace std;

int main() 
{
   int a,w;
  cin>>a>>w;
  if(a>=12)
  {
    if(w>=40 && w<=110)
      cout<<"He can Jump";
    else
      cout<<"Extra ropes will be added";
  }
  else
    cout<<"He can't Jump";
    return 0;
}