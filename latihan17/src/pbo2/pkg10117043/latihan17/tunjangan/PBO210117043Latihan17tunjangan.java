/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan17.tunjangan;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung gaji total
 *                        
 */
public class PBO210117043Latihan17tunjangan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gajipokok;
        double tunjangan;
        String status;
        double total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("==============program tunjangan=============");
        System.out.println("berapa gaji pokok anda perbulan?: Rp.");
        gajipokok = scan.nextDouble();
        
            System.out.println("status anda(menikah/belum) ?:" );
            status = scan.next();
        
        
        System.out.println("");
        
        
        System.out.println("==========hasil perhitungan gaji anda==========");
        System.out.println("gaji pokok\t\t:" + gajipokok);
        //tunjangan
        if(status.equals("menikah")){
            tunjangan = 0.35*gajipokok;
        }else{
            tunjangan = 0;
            
        }
        System.out.println("tunjangan\t\t:" + tunjangan);
        //total gaji
        total = gajipokok + tunjangan;
        
        System.out.println("total gaji\t\t:" + total);
        
    }
    
}
