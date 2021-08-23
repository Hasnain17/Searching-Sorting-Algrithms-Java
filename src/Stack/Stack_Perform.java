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
import static Stack.Stack_Imple.showpop;
import static Stack.Stack_Imple.showpush;
import java.util.*;
public class Stack_Perform 
{
    public  static int arr[]=new int[5];
    public static int i;
    public static void main(String args[])
    {
       Stack abc=new Stack();
        for( i=0;i<5;i++)
        {
            arr[i]=(int) abc.push(i);
        }
       System.out.println(abc);// this is orignal stack
        int num=3; //Now pop removes the last 3 numbers 
        for(int i=1;i<2;i++) //num == 
        {
        abc.pop();//Remove the value by following LIFO last value in and front out
        }
        System.out.println("The value in Stack after applying pop\n"+abc); // the last values removes
        showpush(abc,7); //add value  in statck which will be set at last
        showpush(abc,8);
        showpush(abc,9);
 
        try
        {
        showpop(abc); //pop the value 9 because 9 is at last
        showpop(abc); 
        showpop(abc); 
        showpop(abc); 
        showpop(abc); // At This step stack is empty;
        showpop(abc);
        showpop(abc);
       showpop(abc);// Stack UnderFlow
        }
        catch(EmptyStackException e)
                {
                  System.out.println("Now Stack is Empty");  
                }
    }
}
