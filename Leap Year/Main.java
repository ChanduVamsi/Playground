#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  if(n%4==0)
  {
    if(n%100==0)
    {
      if(n%400==0)
      {
        cout<<"LEAP YEAR";
      }
      else
      {
        cout<<"NOT LEAP YEAR";
      }
    }
    else
    {
      cout<<"LEAP YEAR";
    }
  }
  else
  {
    cout<<"NOT LEAP YEAR";
  }
  return 0;
}