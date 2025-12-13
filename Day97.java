public class LuasPersegi {

    // Method non-void dengan parameter
    // Mengembalikan nilai luas persegi
    public static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {

        int sisi = 6;

        // Memanggil method dan menampilkan hasil
        int luas = hitungLuas(sisi);
        System.out.println("Luas persegi = " + luas);
    }
}
