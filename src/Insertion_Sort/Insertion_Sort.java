/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion_Sort;

/**
 *
 * @author Hasnain Gakhar
 */
import java.util.*;
public class Insertion_Sort 
{
    public static void array(int arr[])
    {
      int temp,j;
      for(int i=1;i<arr.length;i++)
      {
          temp=arr[i];
          j=i;
          while(j>0&&temp<arr[j-1])
          {
              arr[j]=arr[j-1];
              j--;
          }
          arr[j]=temp;
      }
    }
    public static void main(String args[])
    {
        int num;
        Scanner inn=new Scanner(System.in);
         System.out.print("Enter the Size of Array: ");
        num=inn.nextInt();
        int arr[]=new int[num];
        System.out.println("<<<===Enter Numbers in Array===>>>");
        for(int i=0;i<arr.length;i++)
    {
    System.out.print("\nEnter Number at Index:"+i+": ");
    arr[i]=inn.nextInt();
    }
        array(arr);
    System.out.println("<<=Array is Sorted=>>");
    for(int j:arr) //for each loop
    {
        System.out.print(j+"    ");
        }
    }
}
