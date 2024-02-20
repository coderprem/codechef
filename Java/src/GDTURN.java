import java.util.Scanner;

public class GDTURN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a+b>6){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
