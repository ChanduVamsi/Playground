#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s;
  cin>>s;
  int alpha[26]={0};
  char c;
  for(int i=0; i<s.size(); i++)
  {
    char c = s[i];
    alpha[(int)c - 97] += 1;
  }
  for(int i=0; i<26; i++)
  {
    if(alpha[i]!=0)
    {
      cout<<(char)(i+97)<<alpha[i];
    }
  }
  return 0;
}