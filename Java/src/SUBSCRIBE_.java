import java.util.Scanner;

public class SUBSCRIBE_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int number = (a%6==0)?(int)(a/6):(int)(a/6)+1;
            System.out.println(number*b);
        }
    }
}
