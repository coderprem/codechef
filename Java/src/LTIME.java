import java.util.Scanner;

public class LTIME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            System.out.println((a>=1 && a<=4) ? "YES" : "NO");
        }
    }
}
