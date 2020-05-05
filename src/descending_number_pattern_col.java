import java.util.Scanner;

public class descending_number_pattern_col {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for (int i = 5; i >=1 ; i--) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
