#include <iostream>
using namespace std;

int main() 
{
	int n;
  cin>>n;
  switch(n)
  {
    case 8:
      cout<<"Use snipper gun";
      break;
    case 6:
      cout<<"Use AUG A3 / GROZA / QBZ / M16A4 / M416";
      break;
    case 4:
      cout<<"Use UMP9 / AKM / SCAR-L / Cross Bow";
      break;
    case 2:
      cout<<"Almost All guns";
      break;
    default:
      cout<<"Find one";
  }
    return 0;
}