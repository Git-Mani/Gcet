
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ReverseArray1 {
     public static void main(String args[]) throws IOException{
    
    int  t, n,k;
    
    
    //1
    //InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    t=Integer.parseInt(br.readLine());
   
    
    while(t-->0){
     n=Integer.parseInt(br.readLine());
    k=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(br.readLine());
       }
        
      //reverse by grp
     for (int i = 0; i < n; i += k) {
         //int left = i; 
         int right = Math.min(i+k-1,n-1);
         int temp;
         while (i < right) {
            temp = arr[i]; 
            arr[i] = arr[right];
            arr[right] = temp;
            i += 1;
            right -= 1;
         }
      }
        
    
 for (int i = 0; i < n; i++)
     System.out.print(arr[i]);
    }
    
    
    
     } 
    
}
