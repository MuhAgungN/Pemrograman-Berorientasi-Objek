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
public class Lingkaran {
    double R;
    
    /*
    int hitungLuas(int r){
         return (22/7)*r*r;
    }
    
    double hitungluas(double R){
        return 3.14*R*R;
    }
    
    int hitungKeliling(int r){
        return 2*(22/7)*r;
    }
    
    double hitungKeliling(double R){
        return 2*3.14*R;
    }
    */
    
    // construction
    Lingkaran(double a){
        this.R = a;
    }
    
    // method
    void hitungLuas(){
        double hasil = 3.14 * this.R * this.R;
        System.out.println("Luas lingkaran dengan jari-jari "+ R +" = "+ hasil);
    }
    
    void hitungKeliling(){
        double hasil = 2 * 3.14 * this.R;
        System.out.println("Keliling lingkaran dengan jari-jari "+ R +" = "+ hasil);
    }
}