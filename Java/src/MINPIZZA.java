import java.util.Scanner;

public class MINPIZZA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((a*b)%4==0?(int)(a*b)/4:((a*b)/4)+1);
        }
    }
}
