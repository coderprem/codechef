import java.util.Scanner;

public class WATERFLOW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println((a+(c*d))==b?"Filled" : (a+(c*d))<b?"Unfilled" : "Overflow");
        }
    }
}
