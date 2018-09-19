/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author PC
 */
public class TestBola {
    public static void main(String[] args){
        double Jarijari = 14;
        
        Bola bola = new Bola(7);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println("\n\n");
        bola.setJarijari(Jarijari);//manipulasi dengan variabel
        //jarijari yang dibuat
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}
