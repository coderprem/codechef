import java.util.Scanner;

public class TODOLIST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int x = scanner.nextInt();
            int count=0;
            int []list = new int[x];
            for(int i=0; i<x; i++) {
                list[i] = scanner.nextInt();
                if (list[i]>=1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
