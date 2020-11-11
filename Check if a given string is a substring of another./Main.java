#include <iostream>
#include <string>
using namespace std;

int main() 
{
  int t,n,i,j,count;
  cin>>t;
  while(t>0)
  {
    string str, sub;
    cin>>str>>sub;
    for(i=0;i<=(str.size()-sub.size());i++)
    {
      count = 1;
      j=0;
      if(str[i] == sub[j])
      {
        count=0;
        for(j=0;j<sub.size();j++)
        {
          if(str[i+j] != sub[j])
          {
            count++;
            break;
          }
        }
        if(count==0)
        {
          break;
        }
      }
    }
    if(count==0)
      cout<<"Yes";
    else
      cout<<"No";
    cout<<endl;
    t--;
  }
  return 0;
}