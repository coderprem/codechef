import java.util.Scanner;

public class AUDIBLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int x = scanner.nextInt();
            if (x>=47 && x<=45000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
