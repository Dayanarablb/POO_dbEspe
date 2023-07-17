package tarea2_u2_jerarquiaempleados_bautista_dayanara;

//CLASE HIJA
public class Director extends Empleado{ //LA CLASE DIRECTOR HEREDA METODOS Y ATRIBUTOS DE LA CLASE PADRE ABSTRACTA EMPLEADO
    
    //NUEVOS ATRIBUTOS
    String departamento; //variable de tipo String
    int personal; //variable de tipo entero
    
    //CONSTRUCTOR 
    public Director(String nombreEmpleado, int edadEmpleado, int fechaIngreso, double salario, double bono, String departamento, int personal){//Defino parametros
        super(nombreEmpleado, edadEmpleado, fechaIngreso, salario, bono);//Estoy herendado los atributos de la clase padre para eso utilizo super()
        //Inicializo atributos
        this.departamento = departamento;
        this.personal = personal;   
    }
    @Override
    public void incentivar(){
    //Lo que hace este metodo es:
    //Primeramente resto el año actual (2023) - el año en el que ingreso el empleado para saber cuantos años lleva trabajando en la empresa, este calculo se guarda en la variable añosEnEmpresa
    //Los años que lleva el empleado en la empresa multiplico por los 12 meses de año, como resultado me va a dar cuantos meses lleva el trabajador en la Empresa
    int añosEnEmpresa = 2023 - fechaIngreso; 
    int mesesEnEmpresa = añosEnEmpresa * 12;
    //Utilizo el condicional if-else
    //Si el empleado lleva mas de 30 meses trabajando en la empresa &&(se utiliza este operador para que se cumplan dos condiciones, si se cumplen las dos condiciones dara verdadero, si solo una es falsa pues todo sera falso)
    //el tiene a cargo mas de 20 personal el empleado recibira una doble bonificacion
    if (mesesEnEmpresa > 30 && personal > 20) {
        salario += bono * 2;// Incrementar salario con el doble del bono
        System.out.println("Meses que lleva trabajando:" + mesesEnEmpresa);
        System.out.println("Usted cumple con los requisitos necesarios para una doble bonificacion, por lo tanto su salario es de: "+ salario+"$");
        //operador "o" si se cumple una sola condicion es verdadero
        //Si el empleado lleva mas de 30 meses trabajando o tiene 20 personas a cargo se le suma su bonificacion a su salario
    } else if (mesesEnEmpresa > 30 || personal > 20) {
        salario += bono; 
        System.out.println("Meses que lleva trabajando:" + mesesEnEmpresa);
        System.out.println("No cumple con los requisisitos necesarios, por lo tanto solo tiene una bonificacion de $120, por lo tanto su salario es de: "+salario+"$");
    } 
}
}

    
    

