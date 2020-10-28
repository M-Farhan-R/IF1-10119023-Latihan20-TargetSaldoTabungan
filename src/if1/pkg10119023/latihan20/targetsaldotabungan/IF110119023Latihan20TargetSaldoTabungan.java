/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program menghitung berapa lama(bulan) agar jumlah 
 *                     tabungan mencapai target yang ditentukan
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class IF110119023Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        
        System.out.print("Saldo Awal     : Rp.");
        int saldoAwal = scanner1.nextInt();
        
        System.out.print("Bunga/Bulan(%) : ");
        int bunga = scanner2.nextInt();
        
        System.out.print("Saldo target   : Rp.");
        int target = scanner3.nextInt();
        
        //inisialisasi untuk nomor bulan ke-i
        int i = 1;
        
        //format separator 3 digit
        DecimalFormat titik = new DecimalFormat("#,###");
        
        while (saldoAwal<target) {
            System.out.print("Saldo di bulan ke-"+i+" Rp.");
            
            int bunga2 = (bunga*saldoAwal)/100;
            saldoAwal = saldoAwal + bunga2;
            
            System.out.println(titik.format(saldoAwal));
            
            i++;
        }
    }

}
