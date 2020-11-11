#include <iostream>
using namespace std;

class Blank
{
  public:
  int n;
  void display();
};

void Blank::display()
{
  cout<<"FACEPREP.com\nLet's learn together\nValue is: "<<n;
}

int main() 
{
  Blank b;
  cin>>b.n;
  b.display();
  return 0;
}