/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK102_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */
import java.util.Scanner;

public class PRAK102_2110817210012_DwipayanaIsmulya {
    
    public static void main(String[] args) {
        // Deklarasi
        int inputUser, i = 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        // Input User
        inputUser = keyboard.nextInt();
        int cek1 = inputUser;
        
        // Masuk Perulangan
        while(i < 8){
            
            // Jika awal inputUser habis dibagi 2, maka
            if(inputUser % 2 == 0) {
                if(i == 1) {
                    cek1 = ( inputUser / 2 ) - 1;
                    System.out.print(cek1);
                } else if(i % 2 == 1) {
                    cek1 /= 2;
                    System.out.print(cek1);
                } else {
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                }       
            // Jika awal inputUser tidak habis dibagi 2, maka
            } else {
                if(i == 1) {
                    System.out.print(cek1);
                } else if(i % 2 == 1) {
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                } else {                   
                    cek1 /= 2;
                    System.out.print(cek1);
                }
            }    
            // Buat koma
            if(i < 7) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
}
