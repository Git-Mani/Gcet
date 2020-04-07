
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class NumberCounting {
    
   void digit(int n[],int length){
        ArrayList <Integer> arr=new ArrayList<Integer>();
        
       int c=0,num,t=1;
     
       
       for(int i=0;i<length;i++){
           int temp=n[i];
           int flag=1;
           c=0;
           while(flag!=0 && temp!=0){
                num=temp%10;
               temp=temp/10;
          
               
               
               
       switch(num)
        {
           case 1:
                    c++;
                    break;
            case 2:
                c++;
               break;
            case 3:
                c++;
                break;
                
            default:
                c=0;
                flag=0;
                break;
        }
       
       
 }
           
           if(c!=0){
               arr.add(n[i]);
                
              
                    
                    
           t=0;
           
           }
       }
       
       Collections.sort(arr);
       
           
       
       if(t!=0){
     System.out.println(-1);
       }else if(t==0){
             for(int j=0;j<arr.size();j++)
                    {  System.out.print(arr.get(j)+" ");
   } }
       System.out.println();
 
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       NumberCounting nc=new NumberCounting() ;
       while(t-->0){
       int n=Integer.parseInt(br.readLine());
       
       int arr[]=new int[n];
       
      String line = br.readLine();
    String[] strs = line.trim().split("\\s+");
    for(int i=0;i<n;i++)
    arr[i]=Integer.parseInt(strs[i]);
       
       //for(int i=0;i<n;i++){
      nc.digit(arr,n);
       
       
       
       //}
     }
        
        
    
    }
    
}
