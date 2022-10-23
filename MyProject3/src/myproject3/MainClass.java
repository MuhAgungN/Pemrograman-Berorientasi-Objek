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
public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        Persegi p2 = new Persegi();
        p2.sisi = 8;
        p2.hitungLuas();
        p2.hitungKeliling();
        
        Persegi p3 = new Persegi();
        p3.sisi = 13;
        p3.hitungLuas();
        p3.hitungKeliling();
    }
    
}
