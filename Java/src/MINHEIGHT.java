import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class MINHEIGHT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int x = scanner.nextInt();
            int h = scanner.nextInt();
            String result = (x>=h) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
