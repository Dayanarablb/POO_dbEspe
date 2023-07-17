package tarea2_u2_jerarquiaempleados_bautista_dayanara;
//CLASE ABSTRACTA PADRE
public abstract class Empleado {
    //Atributos
    String nombreEmpleado;
    int edadEmpleado;
    int fechaIngreso;
    double salario;
    double bono = 120;
    //Constructor 
    public Empleado(String nombreEmpleado, int edadEmpleado, int fechaIngreso, double salario, double bono){//Denifo Parametros
        //Inicializo atributos
        this.nombreEmpleado = nombreEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.bono = bono;   
    }
    //Metodos
    //Metodo abstracto - no devolvera ningun resultado ni recibira ningun parametro
    public abstract void incentivar();
    //Metodos getters y setters - Acceden y modifican los valores de los atributos
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }
    public int getFechaIngreso() {
        return fechaIngreso;
    }
    public double getSalario() {
        return salario;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }
    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }   
}
