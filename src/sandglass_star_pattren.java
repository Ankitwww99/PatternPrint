import java.util.Scanner;

public class sandglass_star_pattren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
