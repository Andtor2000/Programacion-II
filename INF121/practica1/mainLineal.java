import java.util.Scanner;
public class mainLineal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingrese a,b,c,d,e,f: ");
        
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();

        ecuacionLineal ecuacion = new ecuacionLineal(a, b, c, d, e, f);

        double x=0,y=0;

        if(ecuacion.tieneSolucion()){
            x = ecuacion.getX();
            y = ecuacion.getY();
            System.out.println("x = "+x+", y = "+y);
        }else{
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}