import java.util.Scanner;
 class Fitness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t!=0)
        {
            int x = input.nextInt();
            System.out.println((5*2)*x);
            t--;
        }
    }
    
}
