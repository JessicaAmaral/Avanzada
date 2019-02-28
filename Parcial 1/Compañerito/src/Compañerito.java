/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class Compañerito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        
        double a, b, c;
        
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        
        Procedimiento resolver = new Procedimiento();
        
        System.out.println(resolver.Procedimiento (a,b,c));
         
    }
    
}
