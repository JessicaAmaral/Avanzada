/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Cilindro extends Circulo{
    
    private double altura, area, volumen;
    
    public Cilindro(double radio, int x, int y, double altura) {
        
        super (radio, x, y);
        this.altura=altura;       
    }
    public Cilindro() {
        
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }
     
    public double volumen (){
        
        return super.area()*altura;        
    }
    
    public double area (){
        return super.circunferencia()*(altura)+(super.area()*2);
        
    }
     
    
}
