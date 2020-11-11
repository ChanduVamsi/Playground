#include <iostream>
using namespace std;

int main()
{
    int n1, n2;
    cin >> n1 >> n2;
    int x=n2;
    while(x>0)
    {
      if(n1%x==0 && n2%x==0)
        break;
      x--;
    }
    cout <<x;
    return 0;
}