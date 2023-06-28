
package trianglo;

public class Main {

    
    public static void main(String[] args) {
        //area
        Triangulo triang1 = new Triangulo();
        triang1.setBase(5);
        triang1.setAltura(3);
        System.out.println(triang1.getArea());
    
        
        Triangulo triang2 = new Triangulo(10,5);
        System.out.println(triang2);
      
        System.out.println(triang2.getHipotenusa());
              }
    
}
