import java.util.Scanner;

public class RIGHTTHERE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (a<=b) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
