/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrjer;

/**
 *
 * @author Software-05
 */
public class Interrjer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nama = "abdullah";
        int usia = 16;
        
        // Menampilkan nama dengan penggabungan string yang benar
        System.out.println("Nama saya adalah " + nama);
        
        // Menampilkan nama dengan menggunakan format string (opsional)
        System.out.println("Nama saya adalah " + nama + " dan usia saya adalah " + usia);
        
        // Format string menggunakan printf untuk menampilkan lebih rapi
        System.out.printf("Nama saya adalah %s dan usia saya adalah %d%n", nama, usia);
    }

    }
    

