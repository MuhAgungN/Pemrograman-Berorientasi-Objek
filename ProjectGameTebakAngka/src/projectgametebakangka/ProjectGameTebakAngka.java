/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgametebakangka;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ProjectGameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int acak = r.nextInt(50);
        Scanner input = new Scanner (System.in);
        System.out.println("Tebak angka antara 1 - 50");
        while (true) {
            System.out.print("Angka Tebakan Anda : ");
            int x = input.nextInt();
            if (acak > x) {
                System.out.println("Angka Tebakan Terlalu Kecil");
            } 
            
            if (acak < x) {
                System.out.println("Angka Tebakan Terlalu Besar");
            }            
            
            if (acak == x) {
                System.out.println("Tebakan Anda benar, " + x);
                break;
            } 
        }
        
        
    }
    
}
