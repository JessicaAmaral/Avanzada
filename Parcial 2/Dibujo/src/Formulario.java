
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Formulario extends JFrame{
    
    JButton boton1, boton2, boton3, boton4;
    JTextField texto;
    public int x=0, y=0;
    
    
    public Formulario() {
        boton1 = new JButton ("Arriba");   
        boton2 = new JButton ("Abajo"); 
        boton3 = new JButton ("Izquierda"); 
        boton4 = new JButton ("Derecha");

        
        config();
        clickListener ();
    }
    
    private void config (){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("HolaMundo");
        this.setBackground(Color.GREEN);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        
        add (boton1);
        boton1.setBounds(7, 420, 100, 30);
      
        add (boton2);
        boton2.setBounds(117, 420, 100, 30);

        
        add (boton3);  
        boton3.setBounds(265, 420, 100, 30);
        
        add (boton4);    
        boton4.setBounds(375, 420, 100, 30);

     
    }


 private void clickListener (){
        
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
               y-=5;
               repaint();
            }
        });
        
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                y+=5;
                repaint();
            }
        });
        
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                x-=5;
                repaint();
            }
    
        });
        
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                x+=5;
                repaint();
            }
    
        });
    }
 
     
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(50+x, 50+y, 70, 70);
        
        g.drawLine(86+x, 123+y, 86+x, 300+y);
        g.drawLine(30+x, 200+y, 140+x, 200+y);
        g.drawLine(86+x, 300+y, 50+x, 400+y);
        g.drawLine(86+x, 300+y, 122+x, 400+y);


        
        
    }

}
