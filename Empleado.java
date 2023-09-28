public abstract class Empleado {
    protected int RFC;
    protected String apellidos;
    protected String nombres;

    public Empleado(int RFC, String apellidos, String nombres) {
        this.RFC = RFC;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public int getRFC() {
        return RFC;
    }

    public void setRFC(int rFC) {
        RFC = rFC;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
 abstract void mostrarInformacion();
}