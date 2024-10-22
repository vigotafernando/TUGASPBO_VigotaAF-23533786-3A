/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vigota_tugaspbo1;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class VIGOTA_TUGASPBO1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("Program Menghitung Zakat Harta");
            System.out.println("Pilih jenis harta yang dimasukkan:");
            System.out.println("1. Rupiah");
            System.out.println("2. Emas (gram)");
            System.out.println("3. Akumulasi Uang Tunai dan Emas");
            
            System.out.print("Masukkan pilihan (1, 2, atau 3): ");
            int pilihan = scanner.nextInt();
            
            double hrgEmas = 1500000;
            double jmlharta = 0;

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah harta dalam Rupiah: ");
                jmlharta = scanner.nextDouble();
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah harta dalam gram emas: ");
                double emas = scanner.nextDouble();
                jmlharta = emas * hrgEmas;
            } else if (pilihan == 3) {
                String[] pilihHarta = {"Uang Tunai", "Emas (gram)"};
                double[] jumlahHarta = new double[pilihHarta.length];

                for (int i = 0; i < pilihHarta.length; i++) {
                    System.out.print("Masukkan jumlah " + pilihHarta[i] + ": ");
                    jumlahHarta[i] = scanner.nextDouble();
                    if (pilihHarta[i].equals("Emas (gram)")) {
                        jumlahHarta[i] = jumlahHarta[i] * hrgEmas;
                    }
                }

                for (double harta : jumlahHarta) {
                    jmlharta += harta;
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                return; 
            }

            double jmlzakat = jmlharta * 0.025;

            System.out.println("Jumlah zakat yang harus dibayarkan: Rp " + jmlzakat);

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah menggunakan program.");
    }
}