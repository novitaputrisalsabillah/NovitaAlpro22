import java.util.Scanner;
public class Percabangan{
    public static void main (String[]args){
        String nama;
        int nilai;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nama ");
    nama = scan.next();
    System.out.print("Masukkan nilai");
    nilai = scan.nextInt();

    if (nilai>=60) {
        System.out.print( "Selamat " + nama +" Anda Lulus");
    } else {
        System.out.print( "Maaf " + nama + "Anda Tidak Lulus");
    }
}
}
