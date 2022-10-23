/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author MuhAgungN173
 */
public class Lingkaran {
    int r;
    double phi;
    
    double hitungLuas(){
        double luas = (phi * r * r)*2;
        return luas;
    }
}
