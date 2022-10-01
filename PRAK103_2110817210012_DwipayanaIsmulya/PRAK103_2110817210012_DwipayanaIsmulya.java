/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK103_2110817210012_DwipayanaIsmulya;

/**
 *
 * @author ThinkPad L450 i5
 */

import java.util.Scanner;

public class PRAK103_2110817210012_DwipayanaIsmulya {
    public static void main(String[] args) {
        // Deklarasi
        int inputUser, i = 1, tampungNilai;
        
        Scanner keyboard = new Scanner(System.in);
        
        // inputUser
        inputUser = keyboard.nextInt();
        tampungNilai = inputUser;
        
        // awal do while
        do {
            if(tampungNilai % 7 == 0) {
                System.out.println(" ");
            } else {
                System.out.print(tampungNilai);
                tampungNilai -= 1;
                             
            }
            if(i < 5) {
                System.out.print(", ");                
            }
            i++;  
        } while (i < 6);
        System.out.println("");
    }
}
