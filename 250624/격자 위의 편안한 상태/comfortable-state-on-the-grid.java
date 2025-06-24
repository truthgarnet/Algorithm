import java.util.Scanner;
public class Main {
    public static int[] dx = {1, 0, 0, -1};
    public static int[] dy = {0, 1, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int result[] = new int[m];
        
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = 1;

            for (int dirNum = 0; dirNum < 4; dirNum++) {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if (inRange(nx, ny, n) && arr[nx][ny] == 1) {
                    cnt++;
                }
            }
            if (cnt == 3) {
                result[i] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }
    }
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && n >= x && 0 <= y && n >= y);
    }
}