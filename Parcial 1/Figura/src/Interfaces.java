/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura x;
        
        x = new Circulo (10);
        System.out.println(x.quienEres());
        System.out.println("Area: " + x.area()+"\n");
        
        x = new Cilindro (10,20);
        System.out.println(x.quienEres());
        System.out.println("Area: " + x.area()+"\n");

        x = new Cuadrado (5);     
        System.out.println(x.quienEres());
        System.out.println("Area: " + x.area()+"\n");

        
    }
    
}
