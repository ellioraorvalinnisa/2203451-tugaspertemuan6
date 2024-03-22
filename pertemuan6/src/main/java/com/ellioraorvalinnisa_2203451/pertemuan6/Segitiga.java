/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.pertemuan6;

/**
 *
 * @author Elliora Orva Linnisa
 */

/* atribut dari suatu class */
public class Segitiga {
  double alas; 
  double tinggi; 
  double sisi; 
 
/* konstruktor dengan nilai default alas, tinggi, dan sisi adalah 1, non argumen */
  Segitiga (){
      alas = 1;
      tinggi = 1;
      sisi = 1;
  }

  /* konstruktor dengan nilai alas, tinggi, dan sisi spesifik */
    Segitiga (double alasBaru, double tinggiBaru, double sisiBaru){
      alas = alasBaru;
      tinggi = tinggiBaru;
      sisi = sisiBaru;
  }
    
/* method dari suatu class */

/* menghitung luas segitiga */
  double getLuas (){
      return 0.5 * alas * tinggi;
  }
  
 /* menghitung keliling segitiga */
  double getKeliling (){
      return 3 * sisi;
  }
 
 /* menset nilai atribut segitiga */
  void setAlas (double alasBaru){
      alas = alasBaru;
  }

 /* menset nilai alas segitiga */
  void setTinggi (double tinggiBaru){
      tinggi = tinggiBaru;
  }

 /* menset nilai alas segitiga */
  void setSisi (double sisiBaru){
      sisi = sisiBaru;
  }
 
}