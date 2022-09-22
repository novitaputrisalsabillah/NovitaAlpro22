import java.util.Scanner;
public class soalperulangan {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = scan.nextInt();
        for (int o = 1; o <= n; o++){
            for (int p = n -1 ; p >= o; p--) {
                System.out.print(' ');
            }
            for (int q = 1; q <= o; q++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
