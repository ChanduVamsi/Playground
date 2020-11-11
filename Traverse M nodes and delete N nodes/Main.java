#include <iostream>
using namespace std;

class Node
{
  public:
  	int data;
  	Node* next;
  
    Node(int d)
    {
      data = d;
      next = NULL;
    }
};

class SLL
{
  public:
  	Node* head;
  
    SLL()
    {
      head = NULL;
    }
    SLL(Node* n)
    {
      head = n;
    }
  
  //Member Functions
  void appendNode(Node* n)
  {
    if(head==NULL)
      head=n;
    else
    {
      Node* ptr = head;
      while(ptr->next != NULL)
      {
        ptr = ptr->next;
      }
      ptr->next = n;
    }
  }
  
  void print(int m,int n)
  {
    int count = 1;
    Node* ptr = head;
    while(ptr!=NULL)
    {
      if(count<=m && ptr!=NULL)
      {
        cout<<ptr->data<<" ";
      }
      if(count>=m+n)
        count=0;
      count++;
      ptr = ptr->next;
    }
  }
};

int main() 
{
  SLL s;
  int num,m,n,d;
  cin>>num>>m>>n;
  for(int i=1;i<=num;i++)
  {
    cin>>d;
    Node* n = new Node(d);
    s.appendNode(n);
  }
  s.print(m,n);
  return 0;
}