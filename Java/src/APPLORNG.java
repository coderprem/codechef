import java.util.Scanner;

public class APPLORNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a+b)<=t ? "YES" : "NO");
    }
}
