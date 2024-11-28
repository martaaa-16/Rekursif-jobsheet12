import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n){
        if (n == 1) {
            return (1);
        } else {
            return (n + hitungPenjumlahan(n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int bil = sc.nextInt();

        int hasil = hitungPenjumlahan(bil);
        System.out.println("Hasil penjumlahan rekursif angka " + bil + " = " + hasil);
    }
}