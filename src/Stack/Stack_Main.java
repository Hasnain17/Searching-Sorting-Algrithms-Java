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
import java.util.*;
public class Stack_Main 
{
public static void main(String args[])
{
    Stack_A abc=new Stack_A(5);
    abc.push(1);
    System.out.println(abc.peek());
     abc.push(2);
    System.out.println(abc.peek());
     abc.push(3);
    System.out.println(abc.peek());
     abc.push(4);
    System.out.println(abc.peek());
     abc.push(5);
    System.out.println(abc.peek());
}
}
