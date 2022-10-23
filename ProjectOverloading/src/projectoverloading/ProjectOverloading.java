/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoverloading;

/**
 *
 * @author MuhAgungN173
 */
public class ProjectOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // MyClass
        MyClass m = new MyClass();
        
        m.myMethod();
        m.myMethod(1.20);
        m.myMethod(2, 2.0);
    
    // Persegi
        Persegi p1 = new Persegi();
        p1.hitungLuas(5);
       
        p1.hitungKeliling(5);
        
        Persegi p2 = new Persegi();
        p2.hitungLuas(8.5); 
        p2.hitungKeliling(8.5);

    }
    
}
