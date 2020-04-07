import java.io.*;
public class RemoveCommonString {
 
    
    public static void main(String args[]) throws IOException{
 int t;
 BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
 
 t=Integer.parseInt(br.readLine());
 
 while(t-->0){
 
 String s1=br.readLine();
 String s2=br.readLine();
 String st="";
  StringBuffer sb = new StringBuffer("");
 int flag;
 for(int i=0;i<s1.length();i++){
     flag=0;
     for(int j=0;j<s2.length();j++)
        {
            if (flag==0){
     if(s1.charAt(i)==s2.charAt(j))
     {
     flag=1;
        }
     }}
 if(flag!=1){
     //st=st+s1.charAt(i);
 sb = sb.append(s1.charAt(i));
 
 }
 }
 for(int i=0;i<s2.length();i++){
     flag=0;
     
     
     for(int j=0;j<s1.length();j++)
        {
            if (flag==0){
     if(s2.charAt(i)==s1.charAt(j))
     {
     flag=1;
        }
     }}
 if(flag!=1){
     //st.append(s2.charAt(i));
    //st=st+s2.charAt(i);
 sb = sb.append(s2.charAt(i));
 }
 }
 if(sb.length()!=0){
 System.out.println(sb.toString());
 }else
     System.out.println(-1);
 
 }
 
 }
    
    
    
    
}
