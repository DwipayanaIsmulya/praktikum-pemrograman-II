/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK202_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */

// ========== Start Pelengkap Kode ========== //
// Membuat class mobil
class Mobil {
    String merek;
    String tahun;
    int kapasitas;
    int harga;
    String pemilik;
    
    void info() {
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp. " + this.harga);
        System.out.println("Tahun Keluaran: " + this.tahun);
        System.out.println("Kapasitas: " + this.kapasitas + "cc");
    }
    
    void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    String getPemilik() {
        return this.pemilik;
    }
    
    int getPajak() {
        return this.harga * 2 / 100;
    }
}
// ========== Akhir Pelengkap Kode ========== //

public class Soal2Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun = "2021";
        mobil1.kapasitas = 988;
        mobil1.harga = 202700000;
        
        mobil1.info();
        mobil1.setPemilik("Kasel");
        System.out.println("Pemilik Mobil: " + mobil1.getPemilik());
        System.out.println("Pajak Mobil: Rp. " + mobil1.getPajak());
    }
}
