/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoverloading;

/**
 *
 * @author MuhAgungN173
 */
public class Persegi {
    void hitungLuas(int s){
        int luas = s*s;
        System.out.println("Luas persegi dengan sisi "+s+" adalah "+luas);
    }
    
    void hitungLuas(double s){
        double luas = s*s;
        System.out.println("Luas persegi dengan sisi "+s+" adalah "+luas);
    }
    
    void hitungKeliling(int s){
        int keliling = 4*s;
        System.out.println("Keliling persegi dengan sisi "+s+" adalah "+keliling);
    }
    
    void hitungKeliling(double s){
        double keliling = 4*s;
        System.out.println("Keliling persegi dengan sisi "+s+" adalah "+keliling);
    }
}
