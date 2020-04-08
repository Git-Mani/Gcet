import java.io.*;
public class WaveArray {
    
    
    static int [] evenSwap(int arr[],int n){
    
    
        for(int i=0;i<n;i=i+2){
                if(i+1<n){
                    
                    //x = x ^ y ^ (y = x);
                    
                    arr[i]=arr[i] ^ arr[i+1] ^(arr[i+1] = arr[i]);
                    /*
                arr[i]=arr[i]+arr[i+1];
                arr[i+1]=arr[i]-arr[i+1];
                arr[i]=arr[i]-arr[i+1];*/
                }
        }
    
  return arr;
    
    
    
    
    }
    public static void main(String args[]) throws IOException{
    
     BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
    
    int t=Integer.parseInt(br.readLine());
    
    while(t-->0){
    
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    
    String str=br.readLine();
    String str1[]=str.trim().split("\\s+");
    
   
    
    for(int j=0;j<n;j++)
        a[j]=Integer.parseInt(str1[j]);
    
    
        
        a=evenSwap(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        
        System.out.println();
   
    }
    
    
    
    }
}
