/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.bidang;

/**
 *
 * @author Iqi
 */
public class persegipanjang implements hitungbidang{
      
   public int panjang;
   public int lebar;
    
  public persegipanjang(int panjang, int lebar){
        
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
        @Override
        public double Luas(){
        return panjang*lebar;
    }
       
        @Override
        public double Keliling(){
        return 2*panjang+2*lebar;
    }
}