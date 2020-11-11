#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s;
  getline(cin,s);
  char ch;
  cin>>ch;
  for(int i=0;i<s.length();i++)
  {
    if(s[i]!=ch)
    {
      cout<<s[i];
    }
  }
  return 0;
}