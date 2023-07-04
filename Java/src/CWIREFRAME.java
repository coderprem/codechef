import java.util.Scanner;

public class CWIREFRAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = 2*a + 2*b;
            System.out.println(d*c);
        }
    }
}
