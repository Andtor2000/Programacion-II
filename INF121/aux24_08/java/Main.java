package java;

public class Main {
    public static void main(String[] args){
        String ingrePizza[] = {"masa","peperoni","carne molida","queso","salsa de tomate"};
        Comida pizza = new Comida("Pizza Carnivora",32.99,ingrePizza[],"Pizza carnivora de tamaño mediano");

        System.out.println(pizza);
        for (int i=0 ; i<pizza.ingredientes.length;i++) {
            System.out.println(pizza.ingredientes[i]);
        }
    }
    pizza.vender();
    if(pizza.cambiarPrecio(34)){
        System.out.println("Se ha cambiado el precio");
    }
}
