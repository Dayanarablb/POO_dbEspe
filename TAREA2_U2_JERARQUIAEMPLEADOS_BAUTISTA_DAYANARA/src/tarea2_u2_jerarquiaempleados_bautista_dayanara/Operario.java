package tarea2_u2_jerarquiaempleados_bautista_dayanara;
//CLASE HIJA
public class Operario extends Empleado {
    //NUEVO ATRIBUTO
    int nivel;
    //CONSTRUCTOR
    public Operario(String nombreEmpleado, int edadEmpleado, int fechaIngreso, double salario, double bono, String departamento, int nivel){
    super(nombreEmpleado, edadEmpleado, fechaIngreso, salario, bono);
    this.nivel = nivel;    
    }
    @Override
    public void incentivar(){
        int añosEnEmpresa = 2023 - getFechaIngreso();
        if (añosEnEmpresa > 30 && nivel > 2) {
            salario +=bono * 2; // Incrementar salario con el doble del bono
            System.out.println("Nivel: "+nivel);
            System.out.println("Su nivel es superior a 2 por lo tanto recibe doble bonificacion, su salario es de:" + salario);
        } else if (añosEnEmpresa > 30 || nivel > 2) {
            salario += bono; // Incrementar salario con el bono
            System.out.println("Cumple un solo requisito por lo tanto se maniene su bonificacion, su salario es de:" + salario);   
        }
    }
    public void actualizarNivel() {
        int añosEnEmpresa = 2023 - fechaIngreso;
        if (añosEnEmpresa > 2 && nivel < 5) {
            nivel+=1; // Incrementar el nivel de seguridad
        System.out.println("Su nivel actualizado es: "+nivel);
        }
    }
    //Metodos Get y set
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
@Override
    public double getSalario() {
        return salario;
    }
@Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
@Override
    public int getFechaIngreso() {
        return fechaIngreso;
    }   
}
    
    
    
    

