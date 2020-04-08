
/* Java program to Check if a given array contains duplicate  
   elements within k distance from each other */
import java.util.*; 
import java.io.*;
  
class Main 
{ 
    static boolean checkDuplicatesWithinK(int arr[], int k) 
    { 
       
        HashSet<Integer> set = new HashSet<>(); 
  
      
        for (int i=0; i<arr.length; i++) 
        { 
           
            if (set.contains(arr[i])) 
               return true; 
  
           
            set.add(arr[i]); 
  
           
            if (i >= k) 
              set.remove(arr[i-k]); 
        } 
        return false; 
    } 
  
    public static void main (String[] args) throws IOException 
    { 
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
       int t=Integer.parseInt(br.readLine());
    
    while(t-->0){
    
    String str=br.readLine();    
        String str1[]=str.trim().split("\\s+");
        
    int k=Integer.parseInt(str1[0]);
    int n=Integer.parseInt(str1[1]);
    
    int a[]=new int[n];
    
    
     str=br.readLine();
    String str2[]=str.trim().split("\\s+");
    for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(str2[i]); 
        if (checkDuplicatesWithinK(a, k)) 
           System.out.println("True"); 
        else
           System.out.println("False"); 
    }
    } 
}