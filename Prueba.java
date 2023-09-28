public class Prueba {
    public static void main(String[] args) {
        
        try {
        Empleado eV=new EmpleadoVendedor(123,"Bernal","Carlos",2345.6,456);
        Empleado Ep=new EmpleadoPermanente(1243, "Jose", "Alex", 3456, 12345);
        eV.mostrarInformacion();
        eV.ingresos();
        eV.bonificacion();
        eV.descuento();
        eV.calcularNeto();

        Ep.mostrarInformacion();
        Ep.Afiliacion();
        Ep.ingresos();
        Ep.sueldoNeto();

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
