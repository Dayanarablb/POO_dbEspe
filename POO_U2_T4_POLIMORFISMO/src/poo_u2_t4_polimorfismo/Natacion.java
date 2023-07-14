/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_t4_polimorfismo;

/**
 *
 * @author EFRAIN
 */
public class Natacion extends Deportista{
    private String estilo;
    
    public Natacion(String nombre, int edad, String disciplina, String sexo,String estilo){
        super(nombre, edad, disciplina, sexo);
        this.estilo=estilo;
        
    } 

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Sacaras mucha pepa si haces natacion");
    }
    public void mostrardatos(){
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("EDAD: "+getEdad());
        System.out.println("DISCIPLINA: "+getDisciplina());
        System.out.println("SEXO: "+getSexo());
        System.out.println("PRUEBA: "+getEstilo());
    }
}
