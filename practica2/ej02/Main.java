package practica2.ej02;
public class Main {
    public static void main(String[] args) {
        VectorEn3D a=new VectorEn3D(1.0,3.4,2.2);
        VectorEn3D b=new VectorEn3D(2.0,6.8,4.4);
        double r=2;
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("a+b: "+a.add(b));
        System.out.println("r*a: "+a.escalarR(r));
        System.out.println("longitud a: "+a.magnitud());
        System.out.println("normal a: "+a.normal());
        System.out.println("a.b: "+a.escalar(b));
        System.out.println("a x b: "+a.vectorial(b));
        
    }
}
