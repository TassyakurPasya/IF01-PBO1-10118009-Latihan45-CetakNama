/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan45.cetaknama;

import java.util.Scanner;

/**
 *Nama : Tassyakur Pasya
 * Kelas : IF-01 
 * NIM : 10118009
 * Deskripsi Program : Cetak Nama
 * @author LENOVO
 */
public class IF01PBO110118009Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.nextLine());
        System.out.print("Mau Cetak Berapa Kali : ");
        printer.setJmlCetak(input.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
    }
    
}
