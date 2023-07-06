import java.util.Scanner;

public class TYRE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a*2+b*4);
        }
    }
}
