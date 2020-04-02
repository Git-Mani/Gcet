
import java.util.Scanner;


public class Majority {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    
    while(t-->0)
    {
    int n=sc.nextInt();
    
    int []a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    
    int b=-1,min=0;
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++)
        {
            
            if(a[i]==a[j])
            {
                count++;
            }
}  
        if(count>min)
            {
                min=count;
                b=i;
            }
    }
      if (min > n/2)  
    System.out.println(a[b]);  
      
    else
    System.out.println (-1); 
         
         
    }
    
    
    
    
    }
}
