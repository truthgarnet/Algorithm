import java.util.Scanner;
public class Main {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        
        int x = 0, y = 0;
        int cnt = 0;
        int dirNum = 0;
        boolean flag = false;
        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if (c == 'F') {
                cnt++;
                x = nx;
                y = ny;
                if (x == 0 && y == 0) {
                    System.out.println(cnt);
                    flag = true;
                    break;
                }
            } else if (c == 'R') {
                cnt++;
                dirNum = (dirNum + 1) % 4;
            } else if (c == 'L') {
                cnt++;
                dirNum = (((dirNum - 1) % 4) + 4) % 4;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0);
    }
}