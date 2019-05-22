package co.co.beans;

import java.util.ArrayList;


public class Directivos extends Equipo{
	private String Id;
	private String Nombre;
	private ArrayList<Equipo> equipo;
	
	public Directivos(String Id, String Nombre, ArrayList<Equipo> equipo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.equipo = equipo;
    }

    public Directivos() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo( ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }
	
	

}
