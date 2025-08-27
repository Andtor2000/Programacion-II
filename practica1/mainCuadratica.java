import java.util.Scanner;
public class mainCuadratica {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         System.out.println("Ingrese a,b,c: ");

         double a=sc.nextDouble();
         double b=sc.nextDouble();
         double c=sc.nextDouble();

        ecuacionCuadratica ecuacion = new ecuacionCuadratica(a, b, c);

         if(ecuacion.getDiscriminante()>0){
            System.out.println("La ecuacion tiene 2 raices "+ecuacion.getRaiz1()+" y "+ecuacion.getRaiz2());
         }else if(ecuacion.getDiscriminante()==0){
            System.out.println("La ecuacion tiene 1 raiz: "+ecuacion.getRaiz1());
         }else{
            System.out.println("La ecuacion no tiene raices reales");
         }
    }
}
