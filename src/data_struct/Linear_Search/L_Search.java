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
public class L_Search 
{
int num;
int S_Num;
int Pos;
public int arr[];
public int Perform_Array()
{
    for(int i=0;i<num;i++)
    {
        if(S_Num==arr[0])
        {
            Pos=i;
            break;
        }
    }
    return(Pos);
}
}
