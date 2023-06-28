/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

/**
 *
 * @author pires
 */
public class Retangulo 
{
    //atributos
    double altura;
    double base;
    
    //construtores
    Retangulo()
    {
        this(0,0);
    }
    Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
    //metodos
    double getBase(){return base;}
    double getAltura(){return altura;}
    
    void setBase(int base){this.base = base;}
    void setAltura(int altura){this.altura = altura;}
    
    public String toString()
    {
      return ("Base:"+base+"-Altura:"+altura+"Area:"+getArea());
    }
    
    double getArea()
    {
        return base * altura;
    }
    
}
