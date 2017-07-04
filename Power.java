# set2
import java.util.*;
import java.io.*;
public class Power{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);  
    int n,p,result=1;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        System.out.println("Enter the power:");
        p=sc.nextInt();
    if(n>=0&&p==0)
{
  result=1;
}
    else if(n==0&&p>=1)
{ 
  result=0;
}
    else
{
  for(int i=1;i<=p;i++)
   {
    result=result*n;
   }      
}
    System.out.println(n+"^"+p+"="+result);
 }
 } 
