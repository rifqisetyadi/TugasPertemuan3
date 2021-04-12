/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

import java.util.Scanner;
import tugaspertemuan3.bidang.lingkaran;
import tugaspertemuan3.bidang.persegipanjang;
import tugaspertemuan3.ruang.balok;
import tugaspertemuan3.ruang.kerucut;

/**
 *
 * @author Iqi
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, jarijari;
        int pilih;
                                         
        do {
            
            System.out.println("\n\n----- INPUT -----");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); pilih = input.nextInt();
            
            if (pilih==1) {
                
                System.out.print("Panjang\t\t: "); panjang = input.nextInt();
                System.out.print("Lebar\t\t: "); lebar = input.nextInt();
                System.out.print("Tinggi\t\t: "); tinggi = input.nextInt();
                
                persegipanjang persegipanjang = new persegipanjang(panjang,lebar);
                balok balok = new balok(panjang,lebar,tinggi);
                
                System.out.println("\n----- OUTPUT -----");                
                System.out.println("Luas Persegi\t\t: " + persegipanjang.Luas());
                System.out.println("Keliling Persegi\t: " + persegipanjang.Keliling());
                System.out.println("Volume Balok\t\t: " + balok.Volume());
                System.out.println("Luas Permukaan Balok\t: " + balok.Luaspermukaan());
            }
            
            else if (pilih==2) {
                input = new Scanner(System.in);
                System.out.print("Jari-jari\t: "); jarijari = input.nextInt();
                System.out.print("Tinggi\t\t: "); tinggi = input.nextInt();
                
                kerucut kerucut = new kerucut(tinggi,jarijari);
                lingkaran lingkaran = new lingkaran(jarijari);
                
                System.out.println("\n----- OUTPUT -----");
                System.out.println("Luas Lingkaran\t\t: " + lingkaran.Luas());
                System.out.println("Keliling Lingkaran\t: " + lingkaran.Keliling());
                System.out.println("Volume Kerucut\t\t: " + kerucut.Volume());
                System.out.println("Luas Permukaan Kerucut\t: " + kerucut.Luaspermukaan());
            }
            
        } while (pilih!=3);
    }
}