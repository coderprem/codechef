import java.util.Scanner;

public class KITCHENSPICE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            System.out.println(a<4 ? "Mild" : a<7? "Medium" : "Hot");
        }
    }
}
