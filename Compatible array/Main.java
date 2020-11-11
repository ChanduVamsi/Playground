#include <iostream>
using namespace std;
int main()
{
    int n1,n2,i,is_comp=0;
    cin>>n1;
    int a[n1];
    for(i=0;i<n1;i++)
    {
        cin>>a[i];
    }
    cin>>n2;
    int b[n2];
    for(i=0;i<n2;i++)
    {
        cin>>b[i];
    }
  if(n1 == n2)
  {
    for(i=0;i<n1;i++)
    {
        if(a[i]>=b[i])
        {
            is_comp=1;
        }
      else
        {
            is_comp=0;
            break;
        }
    }
  }
    if(is_comp)
    {
        cout<<"Compatible";
    }
  else
    {
        cout<<"Incompatible";
    }
    return 0;
}