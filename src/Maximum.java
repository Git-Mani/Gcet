//maximum of subarray

import java.io.*;
public class Maximum {
    
    
    public static void main(String args[]) throws IOException{
        
        BufferedReader br=new BufferedReader
        ((new InputStreamReader(System.in)));
    
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
        String str=br.readLine();
        String str1[]=str.trim().split("\\s+");
        int n=Integer.parseInt(str1[0]);
        int k=Integer.parseInt(str1[1]);
        
        int a[]=new int[n];
            str=br.readLine();
        String str2[]=str.trim().split("\\s+");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(str2[i]);
           
           for(int i=0;i<n;i++){
               int temp=0;
              if(i+k<=n){
           for(int j=i;j<i+k;j++){
               
                     temp=Math.max(temp,a[j]);
                      }
            System.out.print(temp+" ");
           
           }
           
           
           
           
           }
            System.out.println();
        }
        
    }
}
