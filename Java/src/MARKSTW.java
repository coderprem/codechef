import java.util.Scanner;

public class MARKSTW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( (a>=2*b) ? "YES" : "NO" );
    }
}
