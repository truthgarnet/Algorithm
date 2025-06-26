import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000000 * 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int timeA = 1, timeB = 1;
        int[] arrA = new int[OFFSET];
        int[] arrB = new int[OFFSET];

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'L') 
                    arrA[timeA] = arrA[timeA-1] - 1; 
                else 
                    arrA[timeA] = arrA[timeA+1] + 1;
                timeA++;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'L') 
                    arrB[timeB] = arrB[timeB-1] - 1; 
                else 
                    arrB[timeB] = arrB[timeB+1] + 1;
                timeB++;
            }
        }
        int cnt = 0;
        int maxTime = Math.max(timeA, timeB);
        for (int i = 1; i < maxTime; i++) {
            System.out.println(arrA[i] + " " + arrB[i]);
            if (arrA[i] == arrB[i])
                cnt++;
        }        
        System.out.println(cnt);
    }
    
}