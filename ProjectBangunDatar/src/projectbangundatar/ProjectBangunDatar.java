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
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi panjang B
        PersegiPanjang B = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.hitungLuas();
        B.hitungKeliling();
        
        // membuat obyek persegi panjang C
        PersegiPanjang C = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        C.panjang = 17;
        C.lebar = 8;
        
        // menghitung luas dan keliling dari B
        C.hitungLuas();
        C.hitungKeliling();
        
          // membuat obyek persegi panjang B
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        D.panjang = 26;
        D.lebar = 14;
        
        // menghitung luas dan keliling dari B
        D.hitungLuas();
        D.hitungKeliling();
        
        Lingkaran L = new Lingkaran();
        L.r = 30;
        L.hitungLuas();
    }
    
}
