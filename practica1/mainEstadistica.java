import java.util.Scanner;
public class mainEstadistica {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n[]=new double[10];
        for (int i = 0; i < 10; i++) {
            n[i]=sc.nextDouble();
        }

        estadistica nums= new estadistica();
        nums.agregarNum(n);
        System.out.println("El promedio es: "+nums.promedio());
        System.out.println("La desviacion estandar es: "+nums.desviacion());
    }
}
