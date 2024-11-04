/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * 
 * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menghitung nilai rata-rata dari beberpa mahasiswa
 */

import java.util.Scanner;

public class TI_23215057_Latihan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        double totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
    }
}

