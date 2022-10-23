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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi P = new Persegi();
        P.sisi = 42;
                
        Lingkaran L = new Lingkaran();
        L.r = 21;
        L.phi = 3.14;
        
        double totalLuas = P.hitungLuas() + L.hitungLuas();
        System.out.println("Total luas bangun kompleks tersebut adalah "+ totalLuas);
    }
    
}
