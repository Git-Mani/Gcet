
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LeaderArray1 {
    public static void main(String args[]){
    
    //InputStreamReader r=new InputStreamReader(System.in);
    //BufferedReader br=new BufferedReader(r);
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
        
    while(t-->0)
    {
    int n=sc.nextInt();;
    int a[]=new int[n];
    int b[]=new int [n/2+1];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();;
    //int min;
    for(int i=0;i<n;i++)
    {
        
        if(i==n-1)
        {  b[i]=a[i];
          //  System.out.print(a[i]+" ");
        }else if(a[i]>a[i+1])
        { b[i]=a[i];
       // System.out.print(a[i]+" ");
       
        } 
        
      }
    for(int i=0;i<b.length;i++){
        if(b.equals(null))
            break;
        System.out.print(b[i]+" ");}
    System.out.println();
    }
    }
    
    
}
