import java.util.Scanner;

public class AGELIMIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           int a = scanner.nextInt();
           if (a>=x && a<y) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
        }
    }
}
