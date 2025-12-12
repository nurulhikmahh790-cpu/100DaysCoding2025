public class Kalkulator {

    // Method non-void: mengembalikan hasil penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method non-void: mengembalikan hasil pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Method non-void: mengembalikan hasil perkalian
    public static int kali(int a, int b) {
        return a * b;
    }

    // Method non-void: mengembalikan hasil pembagian
    public static double bagi(int a, int b) {
        return (double) a / b;  // Casting agar hasil tidak dibulatkan
    }

    public static void main(String[] args) {

        int x = 20;
        int y = 5;

        System.out.println("Penjumlahan : " + tambah(x, y));
        System.out.println("Pengurangan : " + kurang(x, y));
        System.out.println("Perkalian   : " + kali(x, y));
        System.out.println("Pembagian   : " + bagi(x, y));
    }
}
