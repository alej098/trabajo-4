public class main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(30, "Juan", "123456789", 5000);
        System.out.println("Cliente 1:");
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("Nombre: " + cliente1.nombre);
        System.out.println("Teléfono: " + cliente1.telefono);
        System.out.println("Crédito: " + cliente1.credito);

        
        Trabajador trabajador1 = new Trabajador(25, "María", "987654321", 20000);
        System.out.println("\nTrabajador 1:");
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("Nombre: " + trabajador1.nombre);
        System.out.println("Teléfono: " + trabajador1.telefono);
        System.out.println("Salario: " + trabajador1.salario);
    }
}