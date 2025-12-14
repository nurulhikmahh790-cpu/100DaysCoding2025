public class BilanganPrima {

    public static void main(String[] args) {

        int n = 50; // batas akhir bilangan prima

        System.out.println("Deretan bilangan prima dari 1 sampai " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean prima = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
