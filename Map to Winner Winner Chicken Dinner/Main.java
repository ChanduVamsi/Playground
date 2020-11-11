#include <iostream>
using namespace std;

int main() 
{
   int i;
  cin>>i;
  switch(i)
  {
    case 1:
      cout<<"Welcome to Erangel Map. You are Inside a Forest";
      break;
    case 2:
      cout<<"Welcome to Miramar Map. You are Inside a Desert";
      break;
    case 3:
      cout<<"Welcome to Sanhok Map. You are Inside a Rain Forest";
      break;
    case 4:
      cout<<"Welcome to Vikendi Map. You are Inside a Snow Forest";
      break;
  }
    return 0;
}