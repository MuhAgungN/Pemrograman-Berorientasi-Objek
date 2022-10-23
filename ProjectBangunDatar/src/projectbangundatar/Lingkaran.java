/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author MuhAgungN173
 */
public class Lingkaran {
    int r;
    double phi = 3.14;
    
    void hitungLuas(){
        double luas = phi * r * r;
        System.out.println("Luas Lingkaran dengan jari-jari "+r+" adalah "+luas);
    }
}
