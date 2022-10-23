/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;
import static java.awt.PageAttributes.MediaType.A;
import java.util.*;
import static javafx.scene.input.KeyCode.T;
/**
 *
 * @author MuhAgungN173
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    PersegiPanjang A = new PersegiPanjang();
    PersegiPanjang B = new PersegiPanjang();
    PersegiPanjang C = new PersegiPanjang();
    PersegiPanjang D = new PersegiPanjang();
    Persegi X = new Persegi();
    Persegi Y = new Persegi();
    Lingkaran a = new Lingkaran();
    Lingkaran b = new Lingkaran();
    
    System.out.println("Luas persegi panjang dengan panjang 10 dan lebar 5 adalah " + A.hitungLuas(10, 5) + " satuan luas");
    System.out.println("Luas persegi panjang dengan panjang 3.6 dan lebar 8 adalah " + B.hitungLuas(3.6, 8) + " satuan luas");
    System.out.println("Luas persegi panjang dengan panjang 6 dan lebar 8.3 adalah " + C.hitungLuas(6, 8.3) + " satuan luas");
    System.out.println("Luas persegi panjang dengan panjang 5.6 dan lebar 8.8 adalah " + D.hitungLuas(5.6, 8.8) + " satuan luas");
    System.out.println("Keliling persegi panjang dengan panjang 10 dan lebar 5 adalah " + A.hitungKeliling(10, 5) + " satuan keliling");
    System.out.println("Keliling persegi panjang dengan panjang 3.6 dan lebar 8 adalah " + B.hitungKeliling(3.6, 8) + " satuan keliling");
    System.out.println("Keliling persegi panjang dengan panjang 6 dan lebar 8.3 adalah " + C.hitungKeliling(6, 8.3) + " satuan keliling");
    System.out.println("Keliling persegi panjang dengan panjang 5.6 dan lebar 8.8 adalah " + D.hitungKeliling(5.6, 8.8) + " satuan keliling");
    System.out.println("Luas persegi dengan sisi 4.5 adalah " + X.hitungLuas(4.5) + " satuan luas");
    System.out.println("Luas persegi dengan sisi 7 adalah " + Y.hitungLuas(7) + " satuan luas");
    System.out.println("Keliling persegi dengan sisi 4.5 adalah " + X.hitungKeliling(4.5) + " satuan keliling");
    System.out.println("Keliling persegi dengan sisi 7 adalah " + Y.hitungKeliling(7) + " satuan keliling");
    System.out.println("Luas lingkaran dengan jari-jari 5 adalah "+ a.hitungluas(5) +" satuan luas");
    System.out.println("Luas lingkaran dengan jari-jari 7.4 adalah "+ b.hitungluas(7.4) +" satuan luas");
    System.out.println("Keliling lingkaran dengan jari-jari 5 adalah " + a.hitungKeliling(5) + " satuan keliling");
    System.out.println("Keliling lingkaran dengan jari-jari 7.4 adalah " + b.hitungKeliling(7.4) + " satuan keliling");
    */
    
    /*
    PersegiPanjang a = new PersegiPanjang(10, 5);
    a.hitungLuas();
    a.hitungKeliling();
    
    PersegiPanjang b = new PersegiPanjang(3.6, 8);
    b.hitungLuas();
    b.hitungKeliling();
    
    PersegiPanjang c = new PersegiPanjang(6, 8.3);
    c.hitungLuas();
    c.hitungKeliling();
    
    PersegiPanjang d = new PersegiPanjang(5.6, 8.8);
    d.hitungLuas();
    d.hitungKeliling();
    
    Persegi e = new Persegi(4.5);
    e.hitungLuas();
    e.hitungKeliling();
    
    Persegi f = new Persegi(7);
    f.hitungLuas();
    f.hitungKeliling();
    
    Lingkaran g = new Lingkaran(5);
    g.hitungLuas();
    g.hitungKeliling();
    
    Lingkaran h = new Lingkaran(7.4);
    h.hitungLuas();
    h.hitungKeliling();
    
    Segitiga i = new Segitiga(10, 8);
    i.hitungLuas();
    }
    */
        Scanner input = new Scanner(System.in);
        //persegi panjang    
        System.out.print("Masukkan Panjang : ");
        int p = input.nextInt();
        
        System.out.print("Masukkan Lebar : ");
        int l = input.nextInt();
        
        PersegiPanjang pp1 = new PersegiPanjang(p ,l);
        pp1.hitungLuas();
        pp1.hitungKeliling();
        
        //persegi
        System.out.print("Masukkan Sisi : ");
        int s = input.nextInt();
        
        Persegi p1 = new Persegi(s);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        //lingkaran
        System.out.print("Masukkan Jari-jari : ");
        int r = input.nextInt();
        
        Lingkaran l1 = new Lingkaran(r);
        l1.hitungLuas();
        l1.hitungKeliling();
        
        // segitiga
        System.out.print("Masukkan Alas : ");
        int A = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int T = input.nextInt();
        
        Segitiga s1 = new Segitiga(A, T);
        s1.hitungLuas();
    }
}
