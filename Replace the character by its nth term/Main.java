#include <iostream>
using namespace std;

int main() 
{
  string s;
  getline(cin,s);
  int n;
  cin>>n;
  char c = s[n-1];
  n=0;
  while(n<s.size())
  {
    cout<<c;
    n++;
  }
  return 0;
}