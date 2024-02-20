import java.util.Scanner;

public class FINE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int result = (a<=70) ? 0 : (a<101) ? 500 : 2000;
            System.out.println(result);
        }
    }
}
