import java.util.Scanner;

public class bst {

    public static void main(String[] args) {

        Scanner P = new Scanner(System.in);
        int n;
        System.out.print("Input index number: ");
        n = P.nextInt();
        int a[] = new int[n];
        System.out.println("Input sorted value:");
        for (int i = 0; i < n; i++) {
            a[i] = P.nextInt();
        }
        System.out.println("Input search value:");
        int s = P.nextInt();
        int l = 0;
        int r = (n - 1);
        int f = 0;
        int m;
        while (l <= r) {
            m = ((l + r) / 2);
            if (s == a[m]) {
                System.out.println("Found at index no: " + m);
                f = 1;
                break;
            } else if (s > a[m]) {
                l = (m + 1);
            } else {
                r = (m - 1);
            }

        }
        if (f == 0) {
            System.out.println("Not Found");
        }

    }
}
