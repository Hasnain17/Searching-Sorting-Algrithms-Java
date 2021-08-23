/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection_Sort;

/**
 *
 * @author Hasnain Gakhar
 */
import java.util.*;
public class Selection_Sort 
{
public static void S_Sort(int arr[])
{
  int temp;
  int min=0;
  int num=arr.length;
  for(int i=0;i<(arr.length-1);i++)
    {
    min=i;
   for(int j=i+1;j<arr.length;j++)
   {
       if(arr[j]<arr[min])
       {
       min=j; //assign the current value of j to min
       }
   }
   temp=arr[min]; //least value
   arr[min]=arr[i]; //greater value
   arr[i]=temp;
   }
}
public static void main(String args[])
{
    int num;
    Scanner inn=new Scanner (System.in);
    System.out.print("Enter the Size of Array: ");
    num=inn.nextInt();
    int arr[]=new int[num];
    System.out.println("<<<===Enter Numbers in Array===>>>");
    for(int i=0;i<arr.length;i++)
    {
    System.out.print("\nEnter Number at Index:"+i+": ");
    arr[i]=inn.nextInt();
    }
    S_Sort(arr); //when main is created static will automatically call
    System.out.println("<<=Array is Sorted=>>");
    for(int i:arr) //for each loop
    {
        System.out.print(i+"    ");
    }
    }
}
