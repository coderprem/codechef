import java.util.Scanner;

public class AVGPROBLEM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println((float)(a+b)/2>c?"YES":"NO");
        }
    }
}
