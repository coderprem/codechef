import java.util.Scanner;

public class EQUALDIST {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = ((a+b)%2==0) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}