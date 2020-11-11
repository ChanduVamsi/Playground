#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string a,b;
  cin>>a>>b;
  int i,freq[128]={0};
  for(i=0; i<a.size(); i++)
  {
    freq[a[i]]++;
  }
  for(i=0; i<b.size(); i++)
  {
    freq[b[i]]--;
  }
  for(i=0; i<128; i++)
  {
    if(freq[i]!=0)
    {
      cout<<"Not anagrams";
      return 0;
    }
  }
  cout<<"Anagram";
  return 0;
}