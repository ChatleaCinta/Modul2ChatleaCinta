/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author PC
 */
public class Bus {
    public int penumpang;
    public int maxpenumpang;

    
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah " +penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " +maxpenumpang);
    }

    void addPenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
