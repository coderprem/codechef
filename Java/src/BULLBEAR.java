import java.util.Scanner;

public class BULLBEAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (a<b) ? "LOSS" : (a==b) ? "NEUTRAL" : "PROFIT";
            System.out.println(result);
        }
    }
}
