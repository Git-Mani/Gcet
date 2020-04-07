
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;


public class Star {
    void star(ArrayList<Integer> arr){
    int flag;
    ArrayList<Integer> arr1=new ArrayList<Integer>();

    for(int i=0;i<arr.size();i++){
        flag=0;
    for(int j=i+1;j<arr.size();j++)
    {
    if(arr.get(i)>arr.get(j))
    {
    flag=1;
    
    }else if(arr.get(i)<arr.get(j)){
        
        flag=0;
        break;
           //arr.remove(arr.get(i));
    
    }
    
    
    }
      if(flag==1)  
      {
      arr1.add(arr.get(i));
      }
    
    }
     arr1.add(arr.get(arr.size()-1));
     int a=Collections.max(arr1);
     int c=0;
     for(Integer temp:arr1){
         
         if(temp==(Collections.max(arr1)))
         c++;
     }
     
     for(int i=0;i<arr1.size()-1;i++)
        {
            
                if(arr1.get(i)==arr1.get(i+1))
                    arr1.remove(i);
            
        }
     
     
    for(int i=0;i<arr1.size();i++)
        System.out.print(arr1.get(i)+" ");
    
    if(c>1 && a==0 )
        System.out.println(-1);
    System.out.println("\n"+Collections.max(arr1));
    
    }
    
    
    public static void main(String args[]) throws IOException
    {
    
        BufferedReader br= new  BufferedReader((new InputStreamReader (System.in)));
    
    int t=Integer.parseInt(br.readLine());
    
    while(t-->0)
    {
    int n=Integer.parseInt(br.readLine());
    
    ArrayList<Integer> arr=new ArrayList<Integer>();
    
    String str=br.readLine();
    String str1[]=str.trim().split("\\s+");
    
    for(int i=0;i<n;i++)
        arr.add(Integer.parseInt(str1[i]));
    Star ob=new Star();
    ob.star(arr);
    
    }
    
    
    
    
    
    
    
    }}
