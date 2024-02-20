import java.util.Scanner;

public class NETFLIX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println(a+b>=d?"YES":b+c>=d?"YES":c+a>=d?"YES":"NO");
        }
    }
}
