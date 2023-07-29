
package poo_u2_recuperacion_superheroes;


public abstract class Superheroes {
    //Atributos
	String sexo;
	int nivelFuerza;
	String Poderes;
	
	//Constructor
	public Superheroes(String sexo, int nivelFuerza, String Poderes ) {
	this.sexo=sexo;
	this.nivelFuerza=nivelFuerza;
	this.Poderes=Poderes;	
	}
	//Metodo abstracto
	
	public abstract void SalvarMundo();
	
	//Metodos Getters y setters

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNivelFuerza() {
		return nivelFuerza;
	}

	public void setNivelFuerza(int nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}

	public String getPoderes() {
		return Poderes;
	}

	public void setPoderes(String poderes) {
		Poderes = poderes;
	}
	
    
}
