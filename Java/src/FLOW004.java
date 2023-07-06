import java.util.Scanner;

public class FLOW004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int a = scanner.nextInt();
            int sum = a%10;
            int rem = 0;
            while(a>0) {
                rem=a%10;
                a/=10;
            }
            sum+=rem;
            System.out.println(sum);
        }
    }
}
