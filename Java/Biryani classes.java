import java.util.Scanner;
public class Biryani{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t--)
        {
            int x= input.nextInt();
            int y= input.nextInt();
            System.out.println(x*y);
        }
    }
    
}
