import java.util.Scanner;

public class CSPB1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t!=0)
        {
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        t--;
        }
       
    }
}