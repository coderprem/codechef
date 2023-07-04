import java.util.Scanner;

public class READPAGES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String result = (b*c>=a) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
