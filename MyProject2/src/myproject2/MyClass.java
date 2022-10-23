/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject2;

/**
 *
 * @author MuhAgungN173
 */
public class MyClass {
    int x;
    int y;
    
    // void method (non static)
    void myMethod1(int x, int y){
        int hasil = x + y;
        System.out.println("Hasil penjumlahan x="+x+" dan y="+y+" adalah "+hasil);
    }
    
    // non void method (non static)
    int myMethod2(){
        int hasil = this.x + this.y;
        return hasil;
    }
    
    // Jika ingin hasil dari method masih bisa digunakan untuk operasi yang lain, gunakan method non void

    
}
