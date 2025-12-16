package day85;
import java.util.Scanner;
public class merebutkembali {

    static Integer[] arrBaru;
    static int n;

    static int retas(int[] arr) {
        n = arr.length;
        arrBaru = new Integer[n];
        int p = 0;

        for (int x : arr) {
            int idx = x % n;
            while (arrBaru[idx] != null) {
                idx = (idx + 1) % n;
                p++;
            }
            arrBaru[idx] = x;
        }
        return p;
    }

    static String susunKode(int p) {
        int panjang = p % n;
        if (panjang == 0) panjang = n;

        StringBuilder kode = new StringBuilder();

        for (int i = 0; i < n && kode.length() < panjang; i++) {
            if (arrBaru[i] != null) {
                for (char c : arrBaru[i].toString().toCharArray()) {
                    if (kode.length() < panjang) {
                        kode.append(c);
                    }
                }
            }
        }
        return kode.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan angka:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println("Kata sandi: " + kode);
    }
}
