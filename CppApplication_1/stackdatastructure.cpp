/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
#include <iostream>

using namespace std;

class stackImpl
{
public:
    int s[10] = {0};
    int top;
    stackImpl()
    {
         
         top = -1;
    }
   void push(int a)
    {
        if(top == sizeof(a))
        {   
            cout<<"stack is full";
            return;
        }
        s[++top] = a;
    }
    void pop()
    {
        if(top == -1)
        {
            cout<<"stack is empty";
            return;
        }
        s[top--] = NULL;
    }
    int peep()
    {
        if(top == -1)
        {
            cout<<"stack is empty";
            return 0;
        }
        return s[top];
    }
    void print()
    {
        if(top == -1)
        {
            cout<<"stack is empty from print method";
            return;
        }
        int i = top;
        for(i;i>=0;)
        {
            cout<<s[i--]<<endl;
        }
    }
    ~ stackImpl()
    {
    }
        
};
int main(int argc,char *argv[])
{
    cout<<"stack data structure development";
    stackImpl  o ;
    o.push(10);
    o.push(20);
    o.push(30);
    o.push(40);
    o.print();
    o.pop();
    o.print();
    cout<<"peeked element is: "<<o.peep()<<endl;
    o.print();
    
    return 0;
}
