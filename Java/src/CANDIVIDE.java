import java.util.Scanner;

public class CANDIVIDE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            String result = (a%3==0) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
