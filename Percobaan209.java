import java.util.Scanner;

public class Percobaan209 {
    static String deret = "";

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret += "1"; 
            return (1);
        } else {
            deret += x + "x"; 
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        int pangkat = sc.nextInt();

        
        int hasil = hitungPangkat(bilangan, pangkat);

       
        System.out.println("Perhitungan: " + deret + " = " + hasil);
    }
}
