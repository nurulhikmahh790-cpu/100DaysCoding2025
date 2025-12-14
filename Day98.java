public class Fibonacci {

    public static void main(String[] args) {

        int n = 10; // jumlah deret Fibonacci yang ingin ditampilkan
        int a = 0, b = 1;

        System.out.println("Deretan Fibonacci dari 1 sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
