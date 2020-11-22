/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan63.gradiengarislurus;

/**
 *
 * @author Neyza-T
 */
public class Koordinat implements GarisLurus{
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Koordinat(int x1, int y1, int x2, int y2 ){ 
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int getx1(){
        return x1;
    }
    public int gety1(){
        return y1;
    }
    public int getx2(){
        return x2;
    }
    public int gety2(){
        return y2;
    }
    public int hitungGradient(){
        int Gradient = (y2-y1)/(x2-x1);
        return Gradient;
    }

}

    

