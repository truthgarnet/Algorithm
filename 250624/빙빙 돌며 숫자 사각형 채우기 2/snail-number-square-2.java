import java.util.Scanner;
public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};
    public static int x, y = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][m+1];

        // n * m 
        int cnt = 1;
        int dirNum = 0;
        arr[x][y] = 1;
        for (int i = 2; i < n * m + 1; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (!inRange(nx, ny, n, m) || arr[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}