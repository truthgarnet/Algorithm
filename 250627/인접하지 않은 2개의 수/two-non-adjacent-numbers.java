import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+2; j < n; j++) {
                max = Math.max(max, arr[i] + arr[j]);
            }
        }
        System.out.println(max);
    }
}