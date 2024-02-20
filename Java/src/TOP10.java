import java.util.Scanner;

public class TOP10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            String result = (a<=10) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
