import java.util.Scanner;

public class SUMM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String result = (a+b==c) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
