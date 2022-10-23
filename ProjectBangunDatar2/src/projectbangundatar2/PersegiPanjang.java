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
public class PersegiPanjang {
    /*
    int p;
    int l;
    */
    double P;
    double L;
    
    //construction
    /*
    PersegiPanjang(int a, int b){
        this.p = a;
        this.l = b;
    }
    
    PersegiPanjang(double a, int b){
        this.P = a;
        this.l = b;
    }
    
    PersegiPanjang(int a, double b){
        this.p = a;
        this.L = b;
    }
    */
    PersegiPanjang(double a, double b){
        this.P = a;
        this.L = b;
    }
    
    // method
    /*
    void hitungLuas1(){
        int hasil = this.p * this.l;
        System.out.println("Luas persegi panjang a dengan panjang " + p +" dan lebar "+ l +" = "+ hasil);
    }
    
    void hitungLuas2(){
        double hasil = this.P * this.l;
        System.out.println("Luas persegi panjang b dengan panjang " + P +" dan lebar "+ l +" = "+ hasil);
    }
    
    void hitungLuas3(){
        double hasil = this.p * this.L;
        System.out.println("Luas persegi panjang c dengan panjang " + p +" dan lebar "+ L +" = "+ hasil);
    }
    */
    
    void hitungLuas(){
        double hasil = this.P * this.L;
        System.out.println("Luas persegi panjang dengan panjang " + P +" dan lebar "+ L +" = "+ hasil);
    }

    void hitungKeliling(){
        double hasil = 2*(this.P + this.L);
        System.out.println("Keliling persegi panjang dengan panjang " + P +" dan lebar "+ L +" = "+ hasil);
    }
    
    
    
    /*
    int hitungLuas(int p, int l){
        return p * l;
    }
    
    double hitungLuas(double P, int l){
        return P * l;
    }
    
    double hitungLuas(int p, double L){
        return p * L;
    }
     
    double hitungLuas(double P, double L){
        return P * L;
    }
    
    int hitungKeliling(int p, int l){
        return 2*(p + l);
    }
    
    double hitungKeliling(double P, int l){
        return 2*(P + l);
    }
    
    double hitungKeliling(int p, double L){
        return 2*(p + L);
    }
    
    double  hitungKeliling(double P, double L){
        return 2*(P + L);
    }
    */
}
    