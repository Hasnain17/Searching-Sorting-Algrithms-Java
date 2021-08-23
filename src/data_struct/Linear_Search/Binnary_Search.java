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
public class Binnary_Search 
{
    public static void main(String args[])
    {
        int num,S_num,mid=0;
        int start=0,end=0;
        boolean temp=true;  //for unsuitable conditon
        Scanner inn=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        num=inn.nextInt();
        int array[]=new int[num];
        System.out.println("<<<===Enter Numbers in Array (Sorted Form)===>>>");
        for(int i=0;i<array.length;i++)
        {
          System.out.print("\nEnter Number at Index:"+i+": ");
             array[i]=inn.nextInt(); //value assign in Array
        }
        System.out.println("Enter number and find its index Number in Array:");
        S_num=inn.nextInt();
        end=num-1;
     for(int i=0;i<array.length;i++)
     {
       mid=(start+end)/2;
       if(S_num==array[mid])
       {
           temp=true; //if conditon true temp=true
          System.out.println("Your Given Number is at index: "+mid+" ");
                 break; 
       }
       else if(S_num>array[mid])
       {
           temp=false; //if value > array[mid] then temp= false
           start=mid+1;
       }
       else if(S_num<array[mid])
       {
           temp=false; //if value < array[mid] then temp= false
            end=mid-1;
       }
       }
      if(temp==false)
         {
             System.out.println("Number is not finded at any index!!!");
         }
     }
 }
