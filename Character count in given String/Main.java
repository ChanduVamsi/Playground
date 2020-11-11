#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s;
  cin>>s;
  int i,j,count;
  if(s.length()>20)
  {
    cout<<"Invalid Input";
  }
  else{
  while(i<s.length())
  {
    count=1;
    j = i+1;
    while(s[j]==s[i])
    {
      count++;
      j++;
    }
    cout<<s[i]<<count;
    i = j;
  }
  }
  return 0;
}