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
public class Persegi {
    double S;
    
    /*
    int hitungLuas(int s){
        return s*s;
    }
    
    }
    
    int hitungKeliling(int s){
        return 4*s;
    }
   
    }
    */
   
    // construction
    Persegi(double a){
        this.S = a;
    }
    
    // method
    void hitungLuas(){
        double hasil = this.S * this.S;
        System.out.println("Luas persegi dengan sisi "+ S +" = "+ hasil);
    }
    void hitungKeliling(){
        double hasil = 4*this.S;
        System.out.println("Keliling persegi dengan sisi "+ S +" = "+ hasil);
    }
}
