/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.ruang;

import tugaspertemuan3.bidang.lingkaran;
/**
 *
 * @author Iqi
 */
public class kerucut extends lingkaran implements hitungruang {
    int tinggi;
    
  public kerucut(int tinggi, int jarijari){
        super(jarijari);
        this.tinggi = tinggi;
    }
        @Override   
        public double Volume(){
        return Math.PI*jarijari*jarijari*tinggi/3;
    }
    
    
        @Override
        public double Luaspermukaan() {
        float s;
        s = (float) Math.sqrt(jarijari*jarijari+tinggi*tinggi);
        return Math.PI*jarijari*(jarijari+s);
    }
}
