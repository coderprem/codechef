import java.util.Scanner;

public class WATERCONS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            if(a>=2000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
