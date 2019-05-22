package co.co.beans;

import java.util.ArrayList;

public class Jugadores extends Persona{
	private String codigo;
	private ArrayList<Persona>persona;
    

    public Jugadores() {
    }

    public Jugadores(String codigo, ArrayList<Persona>persona) {
        this.codigo = codigo;
        this.persona=persona;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona>persona) {
        this.persona = persona;
    }


}
