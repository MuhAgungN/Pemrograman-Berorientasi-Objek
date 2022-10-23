/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;
/**
 *
 * @author MuhAgungN173
 */
public class Segitiga {
    double A;
    double T;

    // construction
    Segitiga(double a, double b){
        this.A = a;
        this.T = b; 
    }
    
    // method
    void hitungLuas(){
        double hasil = (this.A * this.T)/2;
        System.out.println("Luas segitiga dengan alas "+A+" dan tinggi "+T+" = "+hasil);
    }
}
