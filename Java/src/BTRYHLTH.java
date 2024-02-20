import java.util.Scanner;

public class BTRYHLTH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int x = scanner.nextInt();
            String result = (x>=80) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
