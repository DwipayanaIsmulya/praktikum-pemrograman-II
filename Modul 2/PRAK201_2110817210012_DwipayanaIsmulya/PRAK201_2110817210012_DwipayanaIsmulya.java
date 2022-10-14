/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */

// Membuat Class Sebagai Template dari Class Mangga
class Mangga {
    String nama;
    double berat;
    int harga;
    int jumlahBeli;
    double totalBerat;
    int totalHarga;
    
    // Constructor dengan Parameter
    Mangga(String namaMangga, double beratMangga, int hargaMangga, int jumlahBeliMangga) {
        // Memasukkan Nilai Ke dalam Object
        this.nama = namaMangga;
        this.berat = beratMangga;
        this.harga = hargaMangga;
        this.jumlahBeli = jumlahBeliMangga;
        this.totalBerat = beratMangga * jumlahBeliMangga;
        this.totalHarga = hargaMangga * jumlahBeliMangga;
        
        // Menampilkan Nilai Object
        System.out.println("Nama Mangga : " + this.nama);
        System.out.println("Berat : " + this.berat + " kg");
        System.out.println("Jumlah Beli : " + this.jumlahBeli);
        System.out.println("Total Berat : " + this.totalBerat + " kg");
        System.out.println("Total arga : Rp. " + this.totalHarga);
        System.out.println("");
    }
}


public class PRAK201_2110817210012_DwipayanaIsmulya {
    
    public static void main(String[] args) {
          
        // Instansiasi / Membuat Object
        Mangga ManggaArumanis = new Mangga("Arumanis", 0.3, 5000, 13);
        Mangga ManggaManalagi = new Mangga("Manalagi", 0.5, 7500, 17);
        Mangga ManggaMadu = new Mangga("Mangga Madu", 0.375, 6500, 12);
        
        
    }
}
