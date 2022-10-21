/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

// Import Scanner
import java.util.Scanner;

/**
 *
 * @author ThinkPad L450 i5
 */
public class Main {
    
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);
        
        // Instansiasi / Membuat Object
        Dadu dadu = new Dadu();
        
        // User input banyaknya jumlah dadu (e)
        int inputUser = input.nextInt();
        
        dadu.setInput(inputUser);
        
        dadu.acakNilai();
        dadu.cetakDadu();
    }
}
