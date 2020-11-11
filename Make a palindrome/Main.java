#include <iostream>
#include <string.h>
using namespace std;

bool check(string s, int a, int b)
{
  while(a<b)
  {
    if(s[a]!=s[b])
      return false;
    a++;
    b--;
  }
  return true;
}

int main() 
{
  string s;
  getline(cin,s);
  int i,len=s.size();
  for(i=0;i<len;i++)
  {
    if(check(s,i,len-1))
       break;
  }
  cout<<i;
  return 0;
}