 class EmpleadoVendedor extends Empleado {
    protected double montovendido;
    protected double tasacomision;
    public EmpleadoVendedor(int RFC, String apellidos, String nombres, double montovendido,double tasacomision){
        super(RFC, apellidos, nombres);
        this.montovendido=montovendido;
        this.tasacomision=tasacomision;
    }
    @Override
    void mostrarInformacion() {
        System.out.println("RFC "+RFC);
        System.out.println("Nombre "+nombres);
        System.out.println("Apellido "+apellidos);
    }
    public double ingresos(){
            double ingresos=tasacomision*montovendido;
            return ingresos;
    }
    public void bonificacion(){
        double bonificacion;
        if(montovendido<1000){
            System.out.println("No tiene bonificacion");
        }else if(montovendido>=1000&montovendido<=5000){
            bonificacion=montovendido*0.05;
            System.out.println("Se le bonifico 5% "+bonificacion);
        }else{
            bonificacion=montovendido*0.10;
            System.out.println("Recibio una bonificacion del 10% "+bonificacion);
        }
    }

    public void descuento(){
        double descuentob;
        double descuento=tasacomision*montovendido;
        if(descuento<1000){
            descuentob=descuento*0.11;
            System.out.println("Recibe un descuento del  11 % "+descuentob);
        }else{
            descuentob=descuento*0.15;
            System.out.println("Recibio un descuento del 11% "+descuentob);
        }
    }

    public void calcularNeto(){
        double neto;
    }
}
