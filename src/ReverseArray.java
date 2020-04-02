
import java.util.Scanner;


public class ReverseArray {
    public static void main(String args[]){
    
    int c, t, n,k;
    
    Scanner sc=new Scanner (System.in);
    t=sc.nextInt();
   
    
    while(t-->0){
     n=sc.nextInt();
    k=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        
        
        }
        
      //reverse by grp
      for(int i=0;i<n;i=i+k){
      
      if((i+k)<=n){
      
      for(int j=i+k;j>i;j--)
          
          System.out.print(a[j]);
      }
      
      
      if((i+k)>n){
      
      for(int j=n;j>=i-k+1;j--)
          
          System.out.print(a[j]);
      }
    
      System.out.println();
      
      }
        
        
    

    }
    
    }
}
