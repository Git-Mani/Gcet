import java.util.*;
import java.io.*;
public class Equilibrium {
   
   
    
    
    public static void main(String args[]) throws IOException{
    
    
    BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
    
    int t=Integer.parseInt(br.readLine());
    
    while(t-->0){
    
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    
    String str=br.readLine();
    String str1[]=str.trim().split("\\s+");
    
    Equilibrium ob=new Equilibrium();
    
    for(int j=0;j<n;j++)
        a[j]=Integer.parseInt(str1[j]);
    
        
       if(n == 1)
                System.out.println(n);
                else
                {
                    int leftsum = 0, sum = 0;
                    for(int i = 0; i < n; i++)
                    {
                        sum += a[i];
                    }
                    for(int i = 0; i < n; i++)
                    {
                        sum -= a[i];
                        if(sum == leftsum)
                        {
                            System.out.println(i+1);
                            break;
                        }
                        leftsum += a[i];
                    }
                    if(leftsum != sum)
                        System.out.println("-1");
                }     
        
        
        
    }
    
    
    
    }
    
    
    
    
    
    }

