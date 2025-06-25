import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int cnt = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int z = j+1; z < n; z++) {
                    if (arr[i] <= arr[j] && arr[j] <= arr[z]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}