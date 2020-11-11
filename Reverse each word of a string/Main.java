#include <iostream>
#include <string.h>
using namespace std;

int main() 
{
  string s;
  getline(cin,s);
  int i,j,si,ei,len=s.size();
  ei = len-1;
  for(i=len-1;i>=0;i--)
  {
    if(i==0)
    {
      si=0;
      for(j=si;j<=ei;j++)
      {
        cout<<s[j];
      }
    }
    else if(s[i]==' ')
    {
      si=i+1;
      for(j=si;j<=ei;j++)
      {
        cout<<s[j];
      }
      cout<<" ";
      ei = i-1;
    }
  }
  return 0;
}