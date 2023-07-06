import java.util.Scanner;

public class INTEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        while (t-->0) {
            int x = scanner.nextInt();
            if(x%n==0) sum+=1;
        }
        System.out.println(sum);
    }
}
