import java.util.Scanner;

public class AUCTION {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String result = (Math.max(a,b) == a && Math.max(a,c) ==a) ? "Alice" : (Math.max(a,b) == b && Math.max(b,c) ==b) ? "Bob" : "Charlie";
            System.out.println(result);
        }
    }
}
