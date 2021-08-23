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
public class L_Search_Main 
{
    public static void main(String []args)
    {    
     
        Scanner inn=new Scanner(System.in);
        L_Search abc=new L_Search();
        System.out.println("Enter the Size of Array:");
        abc.num=inn.nextInt();
        for(int i=0;i<abc.num;i++)
        {
           System.out.println("Enter number in Array index:"+i+":  ");
           abc.arr[i]=i;
        }
         System.out.println("\n\n\nNow Enter number and find its Index num in array");
         abc.S_Num=inn.nextInt();
         System.out.println("\n\n\nYour Number is at index number:  "+abc.Perform_Array());
    }
}
