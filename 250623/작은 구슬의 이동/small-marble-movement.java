import java.util.Scanner;

public class Main {
    public static final int[] dx = new int[]{0, 1, -1, 0};
    public static final int[] dy = new int[]{1, 0, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        
        int x = R, y = C;
        int dir = getDir(D);
        int time = 0;
        while(true) {
            if (time >= T) break;
            int nx = x + dx[dir], ny = y + dy[dir];
            if (!inRange(nx, ny, N)) {
                dir = 3 - dir;
            } else {
                x = x + dx[dir];
                y = y + dy[dir];
            }
            time++;
        }

        System.out.print(x + " "+ y);
    }
    public static int getDir(String D) {
        char direction = D.charAt(0);

        if (direction == 'R') {
            return 0;
        } else if (direction == 'D') {
            return 1;
        } else if (direction == 'U') {
            return 2;
        } else {
            return 3;
        }
    }
    public static boolean inRange(int x, int y, int n) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }
}