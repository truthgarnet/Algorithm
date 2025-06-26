import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000 * 100 * 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int timeA = 1;
        int timeB = 1;
        int arrA[] = new int[OFFSET + 1];
        int arrB[] = new int[OFFSET + 1];

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (direction == 'R')
                    arrA[timeA] = arrA[timeA - 1] + 1;
                else 
                    arrA[timeA] = arrA[timeA - 1] - 1;
                timeA++;
            }
        }
        for (int i = 0; i < m; i++) {
            char direction = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (direction == 'R')
                    arrB[timeB] = arrB[timeB - 1] + 1;
                else 
                    arrB[timeB] = arrB[timeB - 1] - 1;
                timeB++;
            }
        }

        int cnt = 0;
        int maxTime = Math.max(timeA, timeB);
        
        int result = getTime(maxTime, arrA, arrB);
        System.out.println(result);
    }
    public static int getTime(int max, int arrA[], int arrB[]) {
        for (int i = 1; i < max; i++) {
            if (arrA[i] == arrB[i]) {
                return i;
            }
        }
        return -1;
    }
}