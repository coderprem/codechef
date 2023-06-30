import java.util.Scanner;

public class IPLTRSH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = Math.max(a - b, 0);
            System.out.println(result);
        }
    }
}
