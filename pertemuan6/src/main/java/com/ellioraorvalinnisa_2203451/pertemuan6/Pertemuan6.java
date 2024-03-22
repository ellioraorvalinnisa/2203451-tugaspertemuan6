/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.pertemuan6;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Pertemuan6 {

    public static void main(String[] args) {
        
        /* inisialisasi objek segitiga 1 */
        Segitiga segitiga1 = new Segitiga(1,1,1);
        System.out.println("Luas dari Segitiga dengan alas " + segitiga1.alas + " tinggi " + segitiga1.tinggi + " sisi " + segitiga1.sisi + " adalah " + segitiga1.getLuas()+ ", sedangkan kelilingnya adalah " +segitiga1.getKeliling());
    
        /* inisialisasi objek segitiga 2 */
        Segitiga segitiga2 = new Segitiga(30,10,90);
        System.out.println("Luas dari Segitiga dengan alas " + segitiga2.alas + " tinggi " + segitiga2.tinggi + " sisi " + segitiga2.sisi + " adalah " + segitiga2.getLuas()+ ", sedangkan kelilingnya adalah " +segitiga2.getKeliling());
    
        /* inisialisasi objek segitiga 3 */
        Segitiga segitiga3 = new Segitiga();
        /* modifikasi nilai atribut ke atributnya langsung */
        //segitiga3.alas = 20;
        //segitiga3.tinggi = 30;
        //segitiga3.sisi = 60;
        /* modifikasi nilai atribut melalui method setAlas, setTinggi, dan setSisi*/
        segitiga3.setAlas(20);
        segitiga3.setTinggi(30);
        segitiga3.setSisi(60);
        System.out.println("Luas dari Segitiga dengan alas " + segitiga3.alas + " tinggi " + segitiga3.tinggi + " sisi " + segitiga3.sisi + " adalah " + segitiga3.getLuas()+ ", sedangkan kelilingnya adalah " +segitiga3.getKeliling());
    }
}
