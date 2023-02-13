import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Input index number: ");
        int n = S.nextInt();
        int[] a = new int[n];
        System.out.println("Input Value: ");
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] <a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
