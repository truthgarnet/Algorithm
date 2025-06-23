import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{-1, 0, 0, 1};
    public static int[] dy = new int[]{0, 1, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dirNum = 0;
        int x = 0, y = 0;
        int cnt = 0;
        boolean check = false;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            for (int j = 0; j < dist; j++) {
                // dist만큼 이동
                dirNum = getDir(dir);
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                cnt++;
                if (x == 0 && y == 0) {
                    check = true;
                    System.out.println(cnt);

                    break;
                }
            }
        }
        if (!check) {
            System.out.println(-1);
        } 
    }

    public static int getDir(char dir) {
        if (dir == 'N')
            return 0;
        else if (dir == 'E')
            return 1;
        else if (dir == 'W')
            return 2;
        else
            return 3;
    }

    public static boolean inRange(int x, int y, int n) {
        return (x > 0 && x < n && y > 0 && y < n);
    }
}