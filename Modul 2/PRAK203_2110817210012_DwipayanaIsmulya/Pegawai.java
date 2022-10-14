/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */

//  Pada baris ini terjadi error karena penamaan public class haruslah sama dengan nama file .java
//  public class Employee {
    public class Pegawai {
    public String nama;
//  Kita ubah tipe data pada baris berikut ke String
//  public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
//  Pada baris ini terjadi error karena tipe data yang tidak kompatibel antara char dengan String,
//  maka kita ubah pada deklarasi tipe data asal dari char menjadi String
    public String getAsal() {
      return asal;
    }
    
//  Pada baris ini terjadi error karena tidak adanya pendeklarasian variabel j pada baris baris sebelumnya
//  public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
