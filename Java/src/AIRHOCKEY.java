import java.util.Scanner;

public class AIRHOCKEY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((a==b && a==0) ? 7 : 7 - Math.max(a,b));
        }
    }
}
