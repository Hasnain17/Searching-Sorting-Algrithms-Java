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
public class Bubble_Sort
{
  public static void array(int arr[])
	{
	int temp=0;
	int num=arr.length;
        for(int i=1;i<num;i++)
	{
            for(int j=0;j<(num-1);j++)
		{
		if(arr[j]>arr[j+1])
                    {
		    temp=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=temp;
		    }
		}
	}
	}
public static void main(String[] args)
{
    int num;
    Scanner inn=new Scanner(System.in);
    System.out.println("Enter the Size of array:");
    num=inn.nextInt();
	int arr[]= new int[num];
        for(int i=0;i<num;i++)
        {
        System.out.println("Enter Number at index:"+i+" : ");
        arr[i]=inn.nextInt();
        }
array(arr); //when main is created static will automatically call
 System.out.println("Array is Sorted \n");
for(int i:arr) //for each loop
{
	System.out.print(i+"   ");
}
}
}
