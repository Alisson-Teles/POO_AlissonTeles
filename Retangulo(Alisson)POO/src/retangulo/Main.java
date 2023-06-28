/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retangulo;

/**
 *
 * @author pires
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo ret1 = new Retangulo(18,12);
      
        System.out.println(ret1.getArea());
        
        Retangulo ret2 = new Retangulo();
         System.out.println(ret2.getArea());
    }
    
}
