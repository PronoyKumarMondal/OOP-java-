import java.util.Scanner;
public class bubbe{
    public static void main(String[] args) {
        Scanner S = new scanner(System.in);
        int n=S.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        int f=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    f=1;
                }
            }
            if(f=0)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}