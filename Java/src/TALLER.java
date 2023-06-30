import java.util.Scanner;

public class TALLER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (a>b) ? "A" : "B";
            System.out.println(result);
        }
    }
}
