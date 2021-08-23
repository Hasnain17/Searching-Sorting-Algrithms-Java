/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_struct.Linear_Search;

/**
 *
 * @author Hasnain Gakhar
 */
import java.util.*;
public class Linear_Search 
{
public static void main(String args[])
{
    int num,S_num;
    boolean temp=true; //for unsuitable conditon
    Scanner inn=new Scanner(System.in);
    System.out.println("Enter the size of Array:");
    num=inn.nextInt();
    int array[]=new int[num];
    for(int i=0;i<array.length;i++)
    {
         System.out.println("Enter number in Array index:"+i+":  ");
         array[i]=inn.nextInt(); //value assign in Array
    }
     System.out.println("Enter number and find its index Number in Array:");
     S_num=inn.nextInt();
         for(int i=0;i<num;i++)
         {
             if(S_num==array[i])
             {
              temp=true; //if conditon true temp=true
               System.out.println("Your Given Number is at index: "+i+" ");
                 break;
             }
             else 
                 temp=false; //if condition no true temp= false
          }
         if(temp==false) //if false then value not found
         {
             System.out.println("Number is not finded at any index!!!");
         }
}
}
