import java.util.Scanner;

public class DOMINANT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(a+b<c?"YES":b+c<a?"YES":c+a<b?"YES":"NO");
        }
    }
}
