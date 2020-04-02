
import java.util.Scanner;


public class EashArray {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    
    while(t-->0){
    int n=sc.nextInt();
    int c=0;
    int a[]=new int [n];
    
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    
    for(int i=0;i<n-1;i++)
    {
    if(a[i]==a[i+1])
    {
    a[i]=2*a[i];
    a[i+1]=0;
    //c++;
    }
    
    }
    /*for(int i=0;i<n;i++)
    {
    if(a[i]==0)
    a[i]=a[i+1];
    }*/
    for(int i=0;i<n;i++){
        if(a[i]!=0){
        System.out.print(a[i]+" ");
        c++;
        }
    }
    while(c<n)
    {
     System.out.print("0 ");
     c++;
    }
    System.out.println();
    }
    
    
    
    }
    
}
