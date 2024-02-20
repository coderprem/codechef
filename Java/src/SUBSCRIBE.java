import java.util.Scanner;

public class SUBSCRIBE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int x = scanner.nextInt();
            String result = (x>30) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
