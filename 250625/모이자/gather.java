import java.util.Scanner;
public class Main {
    public static int MAX_INT = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int distance = 0;
        int multi = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            multi = 0;
            for (int j = i; j < n; j++) {
                distance += a[j] * multi;
                multi++;
            }
            multi = 0;
            for (int z = i; z >= 0; z--) {
                distance += a[z] * multi;
                multi++;
            }

            MAX_INT = Math.min(distance, MAX_INT);
            distance = 0;
        }
        System.out.println(MAX_INT);
    }
}