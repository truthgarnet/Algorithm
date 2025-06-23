import java.util.Scanner;
public class Main {
    public static final int[] dx = {1, -1, 0, 0};
    public static final int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();

        String[] s = commands.split("");
        int dir = 3;
        int x = 0, y = 0;
        int cnt = 0;
        boolean flag = false;
        int turn = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("R")) {
                turn++; // change direction
                cnt++;
                dir = (dir + turn) % 4;        
            } else if (s[i].equals("L")) {
                turn--;
                cnt++;
                if (!inRange(x, y)) 
                    dir = 3 - dir;

            } else if (s[i].equals("F")) { // move
                x = x + dx[dir];
                y = y + dy[dir];
                cnt++;
                if (!inRange(x, y) && x == 0 && y == 0) {
                    flag = true;
                    break;
                }
            }
        }
        int result = flag ? cnt : -1;
        System.out.print(result);
    }

    public static boolean inRange(int x, int y) {
        return (x > 0 && y > 0);
    }

}