/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Ridha161122;

/**
 *
 * @author ridha
 */
public class penjualanExample {
     public static void main( String[] args ){
         
         penjualanRecord penjualan1 = new penjualanRecord();
         
          //student1.setName("Ridha");

         penjualan1.setFaktur("05GDWDH");
         penjualan1.setPelanggan("Ridha");
         penjualan1.setKode("2101092066");
         penjualan1.setHarga(10000);
         penjualan1.setJumlah(2);
         
         //System.out.println("Nama        :"+student1.getName());
         System.out.println("No Faktur = "+penjualan1.getFaktur());
         System.out.println("Nama Pelanggan = "+penjualan1.getPelanggan());
         System.out.println("Kode Penjualan = "+penjualan1.getKode());
         System.out.println("Harga = "+penjualan1.getHarga());
         System.out.println("Jumlah Barang = "+penjualan1.getJumlah());
         System.out.println("Total Harga = "+penjualan1.getTotal());
         System.out.println("Diskon = "+penjualan1.getDiskon());
         System.out.println("Total Bayar = "+penjualan1.getBayar());
            
     }
    
}
