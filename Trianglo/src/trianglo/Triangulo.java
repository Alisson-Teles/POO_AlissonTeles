
package trianglo;


public class Triangulo {
    //atributos
    int base;
    int altura;
    //para a hipotenusa
    double somaquadrado =  (Math.pow(altura, 2)+ Math.pow(base, 2.0));
    
    //construtores
    public Triangulo(){this(0,0);}
    
    public Triangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    
    //metodos:
    public int getBase(){return base;}
    
    public void setBase(int base){this.base =base;}
    public void setAltura(int altura){this.altura=altura;}
    @Override
            public String toString(){
            
                return("Triângulo - base"+base+"-altura"+altura+"-area"+getArea());
            }
    
    public double getArea()
    {
        return((base * altura)/2.0);
    }
    public double getHipotenusa(){
    
    return(Math.hypot(base, altura));
    }
    
}
