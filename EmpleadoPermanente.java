class EmpleadoPermanente extends Empleado{
    protected double sueldobase;
    protected int NumeroSeguro;
    public EmpleadoPermanente(int RFC, String apellidos, String nombres,double sueldobase,int NumeroSeguro){
        super(RFC, apellidos, nombres);
        this.NumeroSeguro=NumeroSeguro;
        this.sueldobase=sueldobase;
    }
    @Override
    void mostrarInformacion() {
        System.out.println("RFC "+RFC);
        System.out.println("Nombre"+nombres);
        System.out.println("Apellido"+apellidos);
    }
    public double ingresos(){
        return sueldobase;
    }
    public void Afiliacion(){
        double sueldito=sueldobase*0.11;
        System.out.println("Se ingreso un descuento del 11%"+ sueldito);
    }
    public void sueldoNeto(){
        double sueld=sueldobase*0.11;
        double neto=sueldobase-sueld;
        System.out.println("El sueldo neto es: "+neto);
    }
}
