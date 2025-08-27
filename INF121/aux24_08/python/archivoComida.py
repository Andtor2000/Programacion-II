class Comida:
    def __init__(self, nombre, precio, ingredientes, descripcion):
        self.nombre = nombre
        self.precio = precio
        self.ingredientes = ingredientes
        self.descripcion = descripcion

    def vender(self):
        print(f"Se ha vendido {self}")

    def cambiarIngredientes(self, ingre):
        self.ingredientes=ingre
        print("Se han cambiado los ingredientes")
    def agregarIngredientes():
    
    def __str__(self):
        return f"Nombre: {self.nombre}\nPrecio: {self.precio}\nDescripcion: {self.descripcion}\nIngredientes: {self.ingredientes}"
    
pizza = Comida("Pizza carnivora", 40.80,["masa","peperoni","carne molida","salsa de tomate"])
print(pizza)