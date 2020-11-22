/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan63.gradiengarislurus;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GarisLurus gr1 = new GarisLurus(2, 10, 5, 6);
        System.out.println("Garis yang melalui titik (2,10) dan (5,6) memiliki gradien sebesar " + gr1.hitungGradient());
        
        GarisLurus gr2 = new GarisLurus(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) memiliki gradien sebesar " + gr2.hitungGradient());
    }
    
}
