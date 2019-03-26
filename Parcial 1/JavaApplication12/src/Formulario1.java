
import java.awt.Color;
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
public class Formulario1 extends JFrame{
    
    JButton boton1, boton2, boton3;
    JTextField texto;
    
    public Formulario1() {
        
        boton1 = new JButton ("Press me");   
        boton2 = new JButton ("Press me"); 
        boton3 = new JButton ("Press me"); 
        texto = new JTextField ();
        
        config();
        clickListener ();
    }
    
    private void config (){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setTitle("HolaMundo");
        this.setBackground(Color.GREEN);
        this.getContentPane().setBackground(Color.CYAN);
        this.setLayout(null);
        
        add (boton1);
        boton1.setSize (500,500);
        boton1.setBounds(10, 0, 300, 100);
        
        
        add (boton2);
        boton2.setSize (500,500);
        boton2.setBounds(10, 100, 300, 100);
        
        
        add (boton3);
        boton3.setSize (500,500);
        boton3.setBounds(10, 200, 300, 100);
      
        
        add (texto);
        texto.setBounds (10,300,300,100);
        
        
    }
    
    private void clickListener (){
        
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
               JOptionPane.showMessageDialog (null, texto.getText());
            }
        });
        
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                texto.setText ("Hola");
            }
        });
        
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                System.exit(0);
            }
        });
    }
        

}
