import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int cnt = 0;
        for (int i = 0; i < input.length()-2; i++) {
            if (input.charAt(i) == '(') {
                if (input.charAt(i+1) == '(') {
                    for (int j = i+1; j < input.length()-1; j++) {
                        if (input.charAt(j) == ')') {
                            if (input.charAt(j+1) == ')') {
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