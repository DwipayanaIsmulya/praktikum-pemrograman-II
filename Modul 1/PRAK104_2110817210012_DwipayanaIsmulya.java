/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK104_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */

import java.util.Scanner;

public class PRAK104_2110817210012_DwipayanaIsmulya {
    
    public static void main(String[] args) {
        
        // Deklarasi
        int[] Andi = new int[3];
        int[] Budi = new int[3];
        int skorAndi = 0, skorBudi = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        // Input Andi
        System.out.print("Kartu Andi: ");
        for (int i = 0; i < 3; i++) {
            Andi[i] = keyboard.nextInt();
        }
        
        // Input Budi
        System.out.print("Kartu Budi: ");
        for (int i = 0; i < 3; i++) {
            Budi[i] = keyboard.nextInt();
        }
        
        // Program Permainan
        for(int i = 0; i < 3; i++) {
            if(Budi[i] < Andi[i]) {
                skorAndi++;
            } else if(Budi[i] > Andi[i]) {
                skorBudi++;
            } 
        }
        
        // Cetak Hasil
        if(skorBudi > skorAndi) {
            System.out.println("Budi");
        } else if(skorBudi < skorAndi) {
            System.out.println("Andi");
        } else {
            System.out.println("Seri");
        }
    }
}
