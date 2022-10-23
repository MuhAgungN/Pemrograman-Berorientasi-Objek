/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author MuhAgungN173
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi A = new Operasi();
        Operasi B = new Operasi();
        Operasi C = new Operasi();
        Operasi D = new Operasi();
        Operasi E = new Operasi();
        Operasi F = new Operasi();
        Operasi G = new Operasi();
        
        System.out.println("Total Operasi A adalah "+ A.jumlahkan(3, 4));
        System.out.println("Total Operasi B adalah "+ B.jumlahkan(4, 7, -9));
        System.out.println("Total Operasi C adalah "+ C.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println("Total Operasi D adalah "+ D.kalikan(4, 5));
        System.out.println("Total Operasi E adalah "+ E.kalikan(5.5, 6.2));
        System.out.println("Total Operasi F adalah "+ F.kalikan(2, 3, 5));
        System.out.println("Total Operasi G adalah "+ G.kalikan(4, 3, 2.8));
    }
    
}
