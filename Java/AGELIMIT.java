import java.util.Scanner;
class AGELIMIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t!=0)
        {
            int x = input.nextInt();
            int y = input.nextInt();
            int a = input.nextInt();
            if(x<=a && y>a)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
            t--;
        }
    }
}
