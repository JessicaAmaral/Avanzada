import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Radix {
 
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner (System.in);
        int a;
        System.out.println("Ingrese el número de números a ingresar");
        a = in.nextInt();
        int num [];
        num = new int [a];
        
        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el número en la posición: "+(i+1));
            num [i] = in.nextInt ();
            
        }
        Radixsort ordenar;
        ordenar = new Radixsort ();
        ordenar.Radixsort(num);
        System.out.println("\nNúmeros ordenados: ");
        for (int h : num)
         
            System.out.print(h + ", ");
    }

}
 