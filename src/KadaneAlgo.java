
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class KadaneAlgo {
public static void main(String args[]) throws IOException{
  
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int t=Integer.parseInt(br.readLine());
    
    
    while(t-->0){
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    String line = br.readLine();
    String[] strs = line.trim().split("\\s+");
    for(int i=0;i<n;i++)
    a[i]=Integer.parseInt(strs[i]);
    
     int i,gMax=a[0],curMax=a[0];



for( i=1; i<a.length;i++){
curMax = Math.max(a[i],curMax+a[i]);
gMax =Math.max(curMax , gMax);

        }

System.out.println(gMax);
    
    }
   }
}
