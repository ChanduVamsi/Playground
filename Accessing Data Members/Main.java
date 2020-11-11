#include <iostream>
using namespace std;

class Name
{
  public:
  string n;
  void printname()
  {
    cout<<"I am "<<n;
  }
};

int main() 
{
  Name n1;
  cin>>n1.n;
  n1.printname();
  return 0;
}