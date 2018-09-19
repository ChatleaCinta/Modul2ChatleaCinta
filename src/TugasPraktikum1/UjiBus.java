/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author PC
 */
public class UjiBus {
    public static void main(String[] args){
        Bus bus = new Bus(30);
        bus.cetak();
        
        //penambahan penumpang
        bus.addPenumpang(28);//menambahkan 15 penumpang
        bus.cetak();
        
        //penambahan jumlah penumpang
        bus.addPenumpang(5);//menambahkan 5 penumpang
        bus.cetak();
        
        //penambahan jumlah penumpang
        bus.addPenumpang(2);//menambahkan 26 penumpang
        bus.cetak();
        
        bus.addPenumpang(10);
        bus.cetak();
        
        System.out.println("Rata-rata penumpang : " +bus.getAverage());
    }
}
