import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int cnt = 0;
        for (int i = 0; i < str.length()-2; i++) {
            for (int j = i+1; j < str.length()-1; j++) {
                for (int z = j+1; z < str.length(); z++) {
                    if (str.charAt(i) == 'C') {
                        if (str.charAt(j) == 'O') {
                            if (str.charAt(z) == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}