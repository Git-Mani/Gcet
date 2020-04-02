
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeaderArray {
    public static void main(String args[]) throws IOException{
    
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    
    int t=Integer.parseInt(br.readLine());
        
    while(t-->0)
    {
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    
    for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
    //int min;
      for(int i=0;i<n;i++)
    {
        
        if(i==n-1)
        {
            System.out.print(a[i]+" ");
        }else if(a[i]>a[i+1])
        {
        System.out.print(a[i]+" ");
       if(i+1<n-1)
        a[i+1]=-1;
        }
      }
    System.out.println();
    }
    }
    
    
}
