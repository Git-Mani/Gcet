
import java.io.*;


public class Positive {
    
    public static void main(String args[]) throws IOException {
    
    BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
    
    int neg=1,pos=0;
    int t=Integer.parseInt(br.readLine());
    
    while(t-->0){
    
    int n=Integer.parseInt(br.readLine());
    
    int a[]=new int[n];
    int b[]=new int[n];
    
    String str=br.readLine();
    String str1[]=str.trim().split("\\s+");
    for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(str1[i]);
    
    for(int i=0;i<n;i++)
    {if(a[i]<0){
        b[neg]=a[i];
        neg=neg+2;
    
    }else if(a[i]>0){
        b[pos]=a[i];
        pos=pos+2;
    }
    
        }
    
    for(int i=0;i<n;i++)
    System.out.print(b[i]+" ");
    
    
    }
    
    
    
    }
    
    
    
}
