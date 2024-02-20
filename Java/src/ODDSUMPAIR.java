import java.util.Scanner;

public class ODDSUMPAIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println((a+b)%2!=0?"YES" : (b+c)%2!=0?"YES" : (c+a)%2!=0?"YES" : "NO");
        }
    }
}
