/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;



/**
 *
 * @author Hasnain Gakhar
 */

public class Stack_A 
{
int maxSize;
int top;
String arr[];
public Stack_A(int n)
{
    maxSize=n;
    arr=new String[maxSize];
}
public boolean empty()
{
if(top==0)
{
    return true;
}
else
{
return false;
}
}
public void push(String str)
{
if(top<maxSize)
{
    arr[top]=str;
    top++;
}
else
{
    System.out.println("Stack Overflow!!");
}
}
public String pop()
{
if(!this.empty())
{
String temp=this.peek();
arr[top-1]=null;
top--;
return temp;
}
else
    return null;
}
public String peek()
{
if(top >0)
{
    return(arr[top-1]);
}
else
{
    return null;
}
}

    void push(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
