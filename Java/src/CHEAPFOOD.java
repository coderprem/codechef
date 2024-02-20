import java.util.Scanner;

public class CHEAPFOOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            System.out.println(a - (int)Math.min(a-100,a*0.90));
        }
    }
}
