
import java.util.Scanner;


public class RotateArray {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    
    while(t-->0){
    int n=sc.nextInt();
    int d=sc.nextInt();
    int temp[]=new int[d];
    int a[]=new int [n];
    
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    
    for(int i=0;i<d;i++)
    {
       temp[i]=a[i];   
    }
   int k=0;
  for(int i=0;i<n;i++){
     if(d<=n-d){
      for(int j=0;j<n-d;j++)
      {
          a[j]=a[d];
      d++;
      } }else 
         if(i>d-i){
      a[i]=temp[k];
      k++;
      }
  
  
  }
  
    
     for(int i=0;i<n;i++)
            System.out.println(a[i]+"..........");
    }
    
    
    
    }
    
}
