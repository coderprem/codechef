import java.util.Scanner;

public class ACTEMP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (b>=a && b>=c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
