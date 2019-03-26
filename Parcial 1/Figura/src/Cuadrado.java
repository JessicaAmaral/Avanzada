/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Cuadrado implements Figura{
    private double lado;
    
    @Override()
    public double area(){
        return lado*lado;       
    }
    
    @Override
    public String quienEres(){
    return "Cuadrado";
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
}
