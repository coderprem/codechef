import java.util.Scanner;

public class FLOW006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            int sum = 0;
            while(n>0){
                int last_digit = n%10;
                sum+=last_digit;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
