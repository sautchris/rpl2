package com.mycompany.saut4ia19;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pert2 {
    public static void main(String[] args) {
        List<barangbaru> daftarBarang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Tambah Data Barang Baru (Y/N): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")){
                break;
            }
                System.out.print("Nama: ");
                String namabrg = input.nextLine();     
                System.out.print("Jumlah: ");
                int jmlhbrg = input.nextInt();           
                System.out.print("Harga: ");
                int hrgbrg = input.nextInt();
                input.nextLine();
                barangbaru barang = new barangbaru (namabrg, jmlhbrg, hrgbrg);
                daftarBarang.add(barang);
    }
        System.out.println("Daftar Barang");
        for (barangbaru barang : daftarBarang){
            System.out.println(barang);
        }
    }
}
