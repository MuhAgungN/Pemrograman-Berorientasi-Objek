/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject3;

/**
 *
 * @author MuhAgungN173
 */
public class Persegi {
    // atribut
    int sisi;
    
    // method
    void hitungLuas(){
        int luas = this.sisi * this.sisi;
        System.out.println ("Persegi dengan sisi "+sisi+" Luasnya adalah : " + luas);
    }
    
    void hitungKeliling(){
        int keliling = this.sisi * 4;
        System.out.println ("Persegi dengan sisi "+sisi+" Kelilingnya adalah : " + keliling);
    }
}
