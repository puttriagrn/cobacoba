import java.util.Scanner;

public class Volume_Balok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Meminta pengguna memasukkan panjang, lebar, dan tinggi
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil
        System.out.println("Volume balok adalah: " + volume);

        // Menutup scanner
        input.close();

    }
}


