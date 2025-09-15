package practica2.ej01;

public class Main {

    public static void main(String[] args) {
        AlgebraVectorial a= new AlgebraVectorial(1,2,3);
        AlgebraVectorial b= new AlgebraVectorial(2,4,6);
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
        System.out.println("a perpendicular b: "+a.Perpendicular(b));
        System.out.println("a paralelo b:      "+a.Paralelo(b));
        
        System.out.println("Proyeccion a sobre b: "+a.proyecSobre(b));
        System.out.println("Componente a en b:    "+a.compEn(b));
    }
    
}
