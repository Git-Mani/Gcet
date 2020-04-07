
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fine {
    void even(int arr[],int fine[],int date){
   int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2!=0){
            sum=sum+fine[i];
    }
    
    }
    
     System.out.println(sum);
    }
   void odd(int arr[],int fine[],int date){
   int sum=0;
   for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0){
            sum=sum+fine[i];
    }
        }
   System.out.println(sum);
   } 
    
    
    public static void main(String args[]) throws IOException{
    
    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    
    int t=Integer.parseInt(br.readLine());
    
       while(t-->0){
           
           String str=br.readLine();
           String st[]=str.trim().split("\\s+");
       int n=Integer.parseInt(st[0]);
       int d=Integer.parseInt(st[1]);
       
       int a[]=new int[n];
       int b[]=new int[n];
       
       str=br.readLine();
       String st1[]=str.trim().split("\\s+");
       for(int i=0;i<n;i++)
             a[i]=Integer.parseInt(st1[i]);
       str=br.readLine();
       String st2[]=str.trim().split("\\s+");
        for(int i=0;i<n;i++)
             b[i]=Integer.parseInt(st2[i]);
       
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"---"+b[i]);
      
        Fine f=new Fine();
       if(d%2==0)
          f.even(a,b,d); 
       else if(d%2!=0)
           f.odd(a,b,d);
       
       
       } 
    
       
           
           }
    
}
