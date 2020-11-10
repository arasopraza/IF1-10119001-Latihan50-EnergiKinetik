/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung energi kinetik
 * berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Energi energi = new Energi(145, 2);

        System.out.println("===Program Menghitung Energi Kinetik===");
        System.out.println("Massa : " + energi.getMassa() + " g");
        System.out.println("Kecepatan : " + energi.getKecepatan() + " m/s");
        System.out.println("Energi Kinetik : " + energi.hitungEnergi() + " joule");
        System.out.println("Jika bola dalam keadaan diam, maka usahanya " + energi.hitungEnergi() + " joule");
    }
}
