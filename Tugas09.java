import java.util.Scanner;

public class Tugas09 {

    // Fungsi iteratif 
    public static int totalIteratif(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    // Fungsi rekursif 
    public static int totalRekursif(int[] numbers, int n) {
        if (n == 0) {
            return 0;
        }
        return numbers[n - 1] + totalRekursif(numbers, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = N; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            numbers[N - i] = scanner.nextInt();
        }

        System.out.println("Pilih metode perhitungan:");
        System.out.println("1. Iteratif");
        System.out.println("2. Rekursif");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            int total = totalIteratif(numbers);
            System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total + " (iteratif)");
        } else if (pilihan == 2) {
            int total = totalRekursif(numbers, N);
            System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total + " (rekursif)");
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

    }
}
