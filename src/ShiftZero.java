
public class ShiftZero {
    public static void main(String args[]){
    
    int a[]={0,2,5,1,0,6,0};
    int temp;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==0 && i!=a.length-1)
        { for(int j=i;j<a.length-1;j++)
            a[j]=a[j+1];
        }
    
    }
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
    }
}
