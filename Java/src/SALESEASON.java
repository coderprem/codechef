import java.util.Scanner;

public class SALESEASON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            System.out.println(a<=100?a: a<=1000?a-25: a<=5000?a-100: a-500);
        }
    }
}
