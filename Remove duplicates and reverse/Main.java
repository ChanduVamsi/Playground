#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s;
  cin>>s;
  if(s.length()>30)
  {
    cout<<"Invalid Input";
  }
  else
  {
    for(int i=0;i<s.length();i++)
    {
      for(int j=i+1;j<s.length();j++)
      {
        if(s[j]==s[i])
        {
          s[i]='#';
          break;
        }
      }
    }
    for(int i=s.length()-1;i>=0;i--)
    {
      if(s[i]!='#')
      {
        cout<<s[i];
      }
    }
  }
  return 0;
}